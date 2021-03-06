package com.test.service.impl;

import com.test.dao.RoleDao;
import com.test.domain.Role;
import com.test.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list() {
        List<Role> roleList = roleDao.finAll();
        return roleList;
    }

    public void save(Role role) {
        roleDao.save(role);
    }
}
