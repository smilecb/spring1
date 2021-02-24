package com.blb.Impl;

import com.blb.UserDao.User;

public class UserImpl implements User {


    public void say(){
        System.out.println("hollow spring");
    }
    public void init(){
        System.out.println("正在执行init方法");
    }
    public void dsetory(){
        System.out.println("正在执行destory方法");
    }
}
