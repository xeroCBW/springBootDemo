package com.cbw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbw.dto.Role;
import com.cbw.mappers.RoleMapper;
import com.cbw.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService{
	
	
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public int deleteByPrimaryKey(Long rid) {
		// TODO Auto-generated method stub
		return roleMapper.deleteByPrimaryKey(rid);
	}

	@Override
	public int insert(Role record) {
		// TODO Auto-generated method stub
		return roleMapper.insert(record);
	}

	@Override
	public int insertSelective(Role record) {
		// TODO Auto-generated method stub
		return roleMapper.insertSelective(record);
	}

	@Override
	public Role selectByPrimaryKey(Long rid) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(rid);
	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Role record) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKey(record);
	}
	
	
	

}
