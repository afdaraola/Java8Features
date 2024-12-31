package com.practique.firstApp;


import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    String firstName;
    String LastName;
    int age;
    String school;
    String faculty;
    String course;
    List<String> activities ;


    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }





    public StudentDao(String firstName, String lastName, int age, String school, String faculty, String course, List<String> activities) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.school = school;
        this.faculty = faculty;
        this.course = course;
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "StudentDao{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", activities=" + activities +
                '}';
    }


}
