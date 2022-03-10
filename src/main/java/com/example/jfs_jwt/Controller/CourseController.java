package com.example.jfs_jwt.Controller;

import com.example.jfs_jwt.Model.Course;
import com.example.jfs_jwt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private final com.example.jfs_jwt.service.CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @CrossOrigin("*")
    @GetMapping("/api/courses")
    public List<Course> all(){
        return courseService.all();
    }
    @PostMapping("/api/courses")
    public void save(@RequestBody Course course){
        courseService.save(course);
    }
    @DeleteMapping("/api/course/{courseId}")
    public void delete(@PathVariable("courseId") String courseId){
        courseService.delete(courseId);
    }
}
