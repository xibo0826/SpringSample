package com.spring.sample;

import com.spring.sample.service.IUserService;
import com.spring.sample.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserContextTest {

    @Test
    public void testSpringIoc() {
        // 获取Spring的bean容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IUserService userService = ac.getBean("UserService", IUserService.class);
        System.out.println(userService);
    }
}
