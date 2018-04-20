package com.schoolSer.mapper;

import com.schoolSer.sqlparam.StuInfo;

public interface StuInfoMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(StuInfo record);

    int insertSelective(StuInfo record);

    StuInfo selectByPrimaryKey(Integer stuid);

    int updateByPrimaryKeySelective(StuInfo record);

    int updateByPrimaryKey(StuInfo record);
    String nextVal();
}