package com.test.dao;

import com.test.domain.User;

import java.util.List;

public interface UserDao {
    List<User> fandAll();


    void saveUserRoleRel(Long id, Long[] roleIds);

    Long save(User user);

    void delUserRoleRel(Long userId);

    void del(Long userId);

    User findByUsernameAndPassword(String username, String password);
}
