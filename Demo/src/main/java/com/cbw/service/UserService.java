package com.cbw.service;

import com.cbw.dto.User;

public interface UserService {

	  int deleteByPrimaryKey(Long uid);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Long uid);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
}
