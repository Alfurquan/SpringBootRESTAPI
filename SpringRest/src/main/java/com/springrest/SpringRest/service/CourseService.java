package com.springrest.SpringRest.service;

import com.springrest.SpringRest.model.Course;

import java.util.*;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(long courseId, Course course1);

    Course deleteCourse(long courseId);
}
