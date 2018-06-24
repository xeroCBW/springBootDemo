package com.cbw.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.cbw.dto.User;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long uid);
    
    User selectByUsername(String username);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}