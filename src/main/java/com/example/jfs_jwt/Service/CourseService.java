package com.example.jfs_jwt.service;
import com.example.jfs_jwt.Model.Course;
import java.util.List;

public interface CourseService
{
    List<Course> all();

    void save( Course course );

    void delete( String courseId );
}

