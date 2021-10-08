package com.test.dao;

import com.test.domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> finAll();

    List<Role> findRoleByUserId(Long id);

    void save(Role role);
}
