package com.abc.service.impl;


import com.abc.bean.StudentDbBean;
import com.abc.dao.StudentDao;
import com.abc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    // Spring对于事务的默认提交方式是：发生运行时异常回滚，发生受查异常提交
    @Transactional(rollbackFor = Exception.class)
    public void saveStudent(StudentDbBean student) throws Exception {
        studentDao.insertStudent(student);
        // int i = 5 / 0;   // 运行时异常
        // if(true) {
        //     // 受查异常
        //     throw new Exception("这是我自定义的异常");
        // }
        // dao.insertStudent(student);
    }

     // Cacheable spring_cache配合使用 redistemplate 限制是内部调用方法时不能过滤，而且效率不如jedis
    @Cacheable(value = "realTimeCache", key = "'student_'+#id")
    public StudentDbBean findStudentById(int id) {
        System.out.println("从DB中查询指定id的Student");
        return studentDao.selectStudentById(id);
    }

    // 使用双重检测锁
    // 不存在线程安全问题
    public Integer findStudentsCount() {
        // spring_redis redistemplate 可以与spring_cache配合使用
        BoundValueOperations<Object, Object> ops =
                redisTemplate.boundValueOps("count");
        Object count = ops.get();
        if (count == null) {
            synchronized (this) {
                count = ops.get();
                if(count == null) {
                    count = studentDao.selectStudentsCount();
                    // 以下语句的底层由以下步骤完成：
                    // 1. 申请一个内核缓存空间m
                    // 2. 将用户空间中的count值读取到内核空间m
                    // 3. 将内核空间m中的数据传递给set()方法中的形参(内核空间 -> 用户空间)
                    // 4. set()方法会将数据传递到协议引擎ProtocolEngine(用户空间 -> 内核空间)
                    // 5. 协议引擎将数据通过网络传递到Redis
                    ops.set(count, 10, TimeUnit.SECONDS);
                }
            }
        }
        return (Integer) count;
    }
}
