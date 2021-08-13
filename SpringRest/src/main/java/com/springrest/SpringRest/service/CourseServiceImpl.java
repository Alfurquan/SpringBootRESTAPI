package com.springrest.SpringRest.service;

import com.springrest.SpringRest.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> courses;

    public CourseServiceImpl(){
        courses = new ArrayList<>();
        courses.add(new Course(1,"Java core course","This course contains basics of java"));
        courses.add(new Course(2,"Spring boot course","Creating REST API using Spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Course getCourse(long courseId) {
        Course courseToReturn = null;
        for(Course course : courses){
            if(course.getId() == courseId){
                courseToReturn = course;
                break;
            }
        }
        return courseToReturn;
    }

    @Override
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course updateCourse(long courseId, Course updatedCourse) {
        Course courseToUpdate = null;
        for(Course course : courses){
            if(course.getId() == courseId){
                courseToUpdate = course;
                break;
            }
        }
        courseToUpdate.setTitle(updatedCourse.getTitle());
        courseToUpdate.setDescription(updatedCourse.getDescription());
        return courseToUpdate;
    }

    @Override
    public Course deleteCourse(long courseId) {
        Course courseToDelete = null;
        for(Course course : courses){
            if(course.getId() == courseId){
                courseToDelete = course;
                break;
            }
        }
        courses.remove(courseToDelete);
        return courseToDelete;
    }
}
