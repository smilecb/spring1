package com.blb.factoy;

import com.blb.Impl.UserImpl;
import com.blb.UserDao.User;

public class UserFa {
  public User getUserFactory(){
      return new UserImpl();
  }
}
