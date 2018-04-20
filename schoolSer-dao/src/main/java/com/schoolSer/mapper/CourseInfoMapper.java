package com.schoolSer.mapper;

import com.schoolSer.sqlparam.CourseInfo;

public interface CourseInfoMapper {
    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);
}