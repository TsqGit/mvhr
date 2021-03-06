package org.tsq.mvhr.mapper;

import org.tsq.mvhr.model.Hr;
import org.tsq.mvhr.model.Role;

import java.util.List;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String userName);

    List<Role> getHrRolesById(Integer id);
}