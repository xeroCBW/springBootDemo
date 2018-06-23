package com.cbw.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbw.dto.IBSLog;
import com.cbw.mappers.IBSLogMapper;
import com.cbw.mappers.UserMapper;
import com.cbw.service.IBSLogService;

@Service
public class IBSLogServiceImpl implements IBSLogService{
	
	
	@Autowired
	private IBSLogMapper ibsLogMapper;
	

	@Override
	public int deleteByPrimaryKey(Integer logId, Date logDate) {
		// TODO Auto-generated method stub
		return ibsLogMapper.deleteByPrimaryKey(logId,logDate);
	}

	@Override
	public int insert(IBSLog record) {
		// TODO Auto-generated method stub
		return ibsLogMapper.insert(record);
	}

	@Override
	public int insertSelective(IBSLog record) {
		// TODO Auto-generated method stub
		return ibsLogMapper.insertSelective(record);
	}

	@Override
	public IBSLog selectByPrimaryKey(Integer logId, Date logDate) {
		// TODO Auto-generated method stub
		return ibsLogMapper.selectByPrimaryKey(logId, logDate);
	}

	@Override
	public int updateByPrimaryKeySelective(IBSLog record) {
		// TODO Auto-generated method stub
		return ibsLogMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(IBSLog record) {
		// TODO Auto-generated method stub
		return ibsLogMapper.updateByPrimaryKey(record);
	}
	
	

}
