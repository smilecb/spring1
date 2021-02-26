package com.blb.factoy;


import com.blb.Dao.UserDao;
import com.blb.Impl.UserDaoImpl;

public class UserFa {
  public UserDao getUserFactory(){
      return new UserDaoImpl();
  }
}
