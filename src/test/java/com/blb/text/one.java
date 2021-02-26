package com.blb.text;

import com.blb.Impl.UserDaoImpl;
import com.blb.seriver.UserSeriver;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class one {
    @Test
    public void text1()
    {
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("anno.xml");
        UserDaoImpl userDao =(UserDaoImpl) app.getBean("UserDao");
        System.out.println(userDao);
        userDao.say();
        app.close();
    }

    @Test
    /**
     * 依赖注入
     */
    public void text2()
    {
       ApplicationContext app=new ClassPathXmlApplicationContext("anno.xml");
       UserSeriver userSeriver=(UserSeriver) app.getBean("UserSeriver");
        userSeriver.say();

    }
}
