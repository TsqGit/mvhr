package org.tsq.mvhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tsq.mvhr.mapper.RoleMapper;
import org.tsq.mvhr.model.Role;

import java.util.List;

/**
 * @Author tsq
 * @Date 2021/3/7 17:34
 * @Description:
 */
@Service
public class PermissService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }
}
