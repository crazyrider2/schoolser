package com.schoolSer.sqlparam;

import java.util.Date;

/**
 * 课程信息
 */
public class CourseInfo {
    private String courseid;

    private String coursename;

    private Date coursestarttime;

    private Date courseendtime;

    private Integer courselimit;

    private String courseflag;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Date getCoursestarttime() {
        return coursestarttime;
    }

    public void setCoursestarttime(Date coursestarttime) {
        this.coursestarttime = coursestarttime;
    }

    public Date getCourseendtime() {
        return courseendtime;
    }

    public void setCourseendtime(Date courseendtime) {
        this.courseendtime = courseendtime;
    }

    public Integer getCourselimit() {
        return courselimit;
    }

    public void setCourselimit(Integer courselimit) {
        this.courselimit = courselimit;
    }

    public String getCourseflag() {
        return courseflag;
    }

    public void setCourseflag(String courseflag) {
        this.courseflag = courseflag == null ? null : courseflag.trim();
    }
}