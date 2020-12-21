package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dOB;
    private int tuitionFees;

    private ArrayList<Assignment> assignmentsPerStudent = new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String lastName,
            LocalDate dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dOB = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getTuitionFees() {
        return tuitionFees;
    }

    public void getFullName() {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }

    public ArrayList<Assignment> getAssignmentsPerStudent() {
        return assignmentsPerStudent;
    }

    public void setAssignmentsPerStudent(ArrayList<Assignment> assignmentsPerStudent) {
        this.assignmentsPerStudent = assignmentsPerStudent;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName= " + firstName + ", lastName= " + lastName + ", DoB= " + dOB + ", tuitionFees= " + tuitionFees + "/2500 " + '}';
    }

}
