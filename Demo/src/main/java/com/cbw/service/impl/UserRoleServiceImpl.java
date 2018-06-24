package com.cbw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbw.dto.UserRole;
import com.cbw.mappers.UserRoleMapper;
import com.cbw.service.UserRoleService;


@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleMapper userRoleMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return userRoleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(UserRole record) {
		// TODO Auto-generated method stub
		return userRoleMapper.insert(record);
	}

	@Override
	public int insertSelective(UserRole record) {
		// TODO Auto-generated method stub
		return userRoleMapper.insert(record);
	}

	@Override
	public UserRole selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return userRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(UserRole record) {
		// TODO Auto-generated method stub
		return userRoleMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(UserRole record) {
		// TODO Auto-generated method stub
		return userRoleMapper.updateByPrimaryKey(record);
	}

}
