package com.ye.dao;

import com.ye.bean.User;

import java.util.List;


public interface UserMapper {
   public User getUser(String name);
   public List<User> getALLUser(User user);
}
