package com.ye.service.Impl;

import com.ye.bean.User;
import com.ye.dao.UserMapper;
import com.ye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userdao;
    public User getUser(String name) {
       return userdao.getUser(name);
    }
    public List<User> getALLUser(User user) {
        return userdao.getALLUser(user);
    }
}
