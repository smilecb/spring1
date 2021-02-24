package com.blb.text;

import com.blb.Impl.UserImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class one {
    @Test
    public void text1()
    {
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("anno.xml");
        UserImpl userDao =(UserImpl) app.getBean("UserDao");
        System.out.println(userDao);
        userDao.say();
        app.close();
    }
}
