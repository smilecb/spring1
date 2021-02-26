package com.blb.text;

import com.blb.Impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo1 {
    public static void main(String[] args) {
       ApplicationContext app=new ClassPathXmlApplicationContext("anno.xml");
        UserDaoImpl userDao =(UserDaoImpl) app.getBean("UserDao");
        userDao.say();
    }


}
