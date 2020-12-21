package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {

    private String title;
    private String stream;
    private LocalDate startDate;
    private LocalDate endDate;

    private ArrayList<Trainer> trainersPerCourse = new ArrayList<>();
    private ArrayList<Student> studentsPerCourse = new ArrayList<>();
    private ArrayList<Assignment> assignmentsPerCourse = new ArrayList<>();

    public Course() {
    }

    public Course(String t, String s, LocalDate sD, LocalDate eD) {
        this.title = t;
        this.stream = s;
        this.startDate = sD;
        this.endDate = eD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Trainer> getTrainersPerCourse() {
        return trainersPerCourse;
    }

    public void setTrainersPerCourse(ArrayList<Trainer> trainersPerCourse) {
        this.trainersPerCourse = trainersPerCourse;
    }

    public ArrayList<Student> getStudentsPerCourse() {
        return studentsPerCourse;
    }

    public void setStudentsPerCourse(ArrayList<Student> studentsPerCourse) {
        this.studentsPerCourse = studentsPerCourse;
    }

    public ArrayList<Assignment> getAssignmentsPerCourse() {
        return assignmentsPerCourse;
    }

    public void setAssignmentsPerCourse(ArrayList<Assignment> assignmentsPerCourse) {
        this.assignmentsPerCourse = assignmentsPerCourse;
    }

    @Override
    public String toString() {
        return "Course{" + "title= " + title + ", stream= " + stream + ", startDate= " + startDate + ", endDate= " + endDate + '}';
    }

}
