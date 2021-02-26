package com.blb.seriver;

import com.blb.Dao.UserDao;
import com.blb.Impl.UserDaoImpl;

public class UserSeriver {

    private UserDaoImpl userDaoImpl;

//    public void setUserDaolmpl(UserDaoImpl userDaoImpl) {
//        this.userDaoImpl = userDaoImpl;
//    }

    public UserSeriver(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public UserSeriver() {
    }

    public void say()
    {
       userDaoImpl.say();
//        System.out.println("12");
    }

}
