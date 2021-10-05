package com.openlab.service.impl;

import com.openlab.dao.UserDao;
import com.openlab.pojo.User;
import com.openlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    @Cacheable(value = "Users")
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    @CacheEvict(value = {"Users"},allEntries = true)
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void updateUser(Long id, User user) {
            user.setId(id);
            userDao.saveAndFlush(user);
    }

    @Override
    public void delteById(Long id) {
            userDao.deleteById(id);
    }
}
