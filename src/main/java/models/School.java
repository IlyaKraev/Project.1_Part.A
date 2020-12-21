package models;

import java.util.ArrayList;

public class School {

    public ArrayList<Student> studentList = new ArrayList<>();
    public ArrayList<Course> courseList = new ArrayList<>();
    public ArrayList<Trainer> trainerList = new ArrayList<>();
    public ArrayList<Assignment> assignmentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public ArrayList<Trainer> getTrainersList() {
        return trainerList;
    }

    public ArrayList<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void setTrainerList(ArrayList<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public void setAssignmentList(ArrayList<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

}
