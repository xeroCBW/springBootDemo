package com.cbw.mappers;

import com.cbw.dto.IBSLog;
import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBSLogMapper {
    int deleteByPrimaryKey(@Param("logId") Integer logId, @Param("logDate") Date logDate);

    int insert(IBSLog record);

    int insertSelective(IBSLog record);

    IBSLog selectByPrimaryKey(@Param("logId") Integer logId, @Param("logDate") Date logDate);

    int updateByPrimaryKeySelective(IBSLog record);

    int updateByPrimaryKey(IBSLog record);
}