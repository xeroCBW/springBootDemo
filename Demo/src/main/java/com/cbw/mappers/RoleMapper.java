package com.cbw.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.cbw.dto.Role;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Long rid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}