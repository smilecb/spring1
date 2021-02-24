package com.blb.factoy;

import com.blb.Impl.UserImpl;
import com.blb.UserDao.User;

public class UserFactory {


    public static User getUserFactory()
     {
         return new UserImpl();
     }
}
