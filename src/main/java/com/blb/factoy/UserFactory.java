package com.blb.factoy;

import com.blb.Dao.UserDao;
import com.blb.Impl.UserDaoImpl;


public class UserFactory {


    public static UserDao getUserFactory()
     {
         return new UserDaoImpl();
     }
}
