package com.abc.component;

import com.abc.configuration.JedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.component
 * @ClassName: CacheUtil
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/15 18:14
 * @Version: 1.0
 */
@Component
public class CacheUtil {

    @Autowired
    private JedisConfig jedisConfig;

    private static final int default_time = 36000;// 过期时间（秒）



    public void add(String key, Object o, int time) {
        jedisConfig.addObject(key, o, time);
    }

    public void set(String key, Object o, int time) {
        jedisConfig.addObject(key, o, time);
    }

    /**
     * 分布式排他锁控制
     *
     * @param key
     * @param o
     * @param time
     */
    public void setnx(String key, Object o, int time) {
        jedisConfig.addObjectNx(key, o, time);
    }

    public void set(String key, Object o) {
        jedisConfig.addObject(key, o);
    }

    public void replace(String key, Object o) {
        jedisConfig.replace(key, o, default_time);
    }

    public Object get(String key) {
        return jedisConfig.getObject(key);
    }

    public Long incr(String key) {
        return jedisConfig.incr(key);
    }

    public void delete(String key) {
        jedisConfig.remove(key);
    }

    public void disConnect() {
        jedisConfig.getJedis().disconnect();
    }


}
