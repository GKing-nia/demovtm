package com.tzy.www.dao;

import com.tzy.www.po.Course;
import com.tzy.www.po.CourseInfo;
import com.tzy.www.po.Student;

import java.util.List;

public interface CourseDao {
    public boolean addcou(Course course);
    public List<Course> liulankecheng();
    public Course searchByid(int id);
    public boolean updatecou(int id,int snum);
    public boolean addjiben(String cpid, String tpid, String spid, Student student);
    public List<Course> liulankecheng1();
    public List<CourseInfo> searchstuinfo(String tpid);
    public List<CourseInfo> searchcouinfo(String spid);

    public List<CourseInfo> searchstuinfo(String spid,String cpid);
    public boolean mod_score(String spid,String cpid,String score);
}
