package com.cbw.service;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.cbw.dto.IBSLog;

public interface IBSLogService {

    int deleteByPrimaryKey(@Param("logId") Integer logId, @Param("logDate") Date logDate);

    int insert(IBSLog record);

    int insertSelective(IBSLog record);

    IBSLog selectByPrimaryKey(@Param("logId") Integer logId, @Param("logDate") Date logDate);

    int updateByPrimaryKeySelective(IBSLog record);

    int updateByPrimaryKey(IBSLog record);
	
}
