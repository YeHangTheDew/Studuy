package com.ye.service;

import com.ye.bean.User;

import java.util.List;

public interface UserService {
    public User getUser(String name);
    public List<User> getALLUser(User user);
}
