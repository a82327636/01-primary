package com.abc.controller;

import com.abc.bean.StudentDbBean;
import com.abc.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.controller
 * @ClassName: MybatisController
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/14 17:04
 * @Version: 1.0
 */
@Controller // @RestController 不会返回页面只会返回responseBody
@RequestMapping(value="/studentDb")
public class StudentDbController {

    private Logger logger = LoggerFactory.getLogger(StudentDbController.class);

    @Autowired
    private StudentService service;

    @RequestMapping("/register")
    public String registerHandle(StudentDbBean student) throws Exception {
        logger.info("注册了!");
        service.saveStudent(student);
        return "/page/welcome.jsp";
    }


}
