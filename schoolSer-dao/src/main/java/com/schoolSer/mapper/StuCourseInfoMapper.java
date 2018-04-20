package com.schoolSer.mapper;

import com.schoolSer.sqlparam.StuCourseInfo;
import com.schoolSer.sqlparam.StuCourseInfoKey;

public interface StuCourseInfoMapper {
    int deleteByPrimaryKey(StuCourseInfoKey key);

    int insert(StuCourseInfo record);

    int insertSelective(StuCourseInfo record);

    StuCourseInfo selectByPrimaryKey(StuCourseInfoKey key);

    int updateByPrimaryKeySelective(StuCourseInfo record);

    int updateByPrimaryKey(StuCourseInfo record);
}