package functions;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import models.Student;
import models.Trainer;
import models.Course;
import models.Assignment;

public class Synthetic {

    public static ArrayList<Student> synthStudents() {
        ArrayList allStudents = new ArrayList<>();
        Student s = new Student("Felix", "Kiel", (LocalDate.of(1992, Month.MARCH, 15)), 2500);
        Student s1 = new Student("Panos", "Lianos", (LocalDate.of(1993, Month.MAY, 15)), 2500);
        Student s2 = new Student("Anna", "Gasparova", (LocalDate.of(1990, Month.APRIL, 20)), 1000);
        Student s3 = new Student("Jane", "Smith", (LocalDate.of(2000, Month.DECEMBER, 26)), 2000);
        Student s4 = new Student("Kostas", "Karapapadopoulos", (LocalDate.of(1985, Month.JULY, 30)), 500);
        Student s5 = new Student("Greg", "Gregerson", (LocalDate.of(1975, Month.MAY, 28)), 1500);
        Student s6 = new Student("Yvonne", "Schmidt", (LocalDate.of(2000, Month.FEBRUARY, 17)), 2500);
        Student s7 = new Student("Katherine", "Riva", (LocalDate.of(1997, Month.NOVEMBER, 25)), 2500);
        Student s8 = new Student("What", "Ever", (LocalDate.of(1982, Month.SEPTEMBER, 10)), 2000);
        Student s9 = new Student("Elijah", "Wood", (LocalDate.of(1972, Month.MARCH, 03)), 2000);
        Student s10 = new Student("Claire", "Winston", (LocalDate.of(1965, Month.DECEMBER, 23)), 300);
        Student s11 = new Student("Umbongo", "Congobongo", (LocalDate.of(1977, Month.JUNE, 17)), 250);
        Student s12 = new Student("Wei", "Shen", (LocalDate.of(1978, Month.OCTOBER, 19)), 2525);
        Student s13 = new Student("Mii", "Yuu", (LocalDate.of(1979, Month.DECEMBER, 24)), 1150);
        Student s14 = new Student("Jake", "Lake", (LocalDate.of(1988, Month.JANUARY, 18)), 500);
        Student s15 = new Student("Joseph", "Stalin", (LocalDate.of(1985, Month.APRIL, 28)), 1000);
        Student s16 = new Student("Schlomo", "Shekelberg", (LocalDate.of(1990, Month.MAY, 23)), 617);
        Student s17 = new Student("Maggy", "Goldstein", (LocalDate.of(1985, Month.OCTOBER, 26)), 617);
        Student s18 = new Student("Simone", "Beauvoir", (LocalDate.of(1988, Month.SEPTEMBER, 22)), 315);
        Student s19 = new Student("Jean-Paul", "Satre", (LocalDate.of(1999, Month.MARCH, 11)), 2000);
        Student s20 = new Student("Martin", "Heidegger", (LocalDate.of(1990, Month.JUNE, 07)), 2500);
        allStudents.add(s);
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        allStudents.add(s4);
        allStudents.add(s5);
        allStudents.add(s6);
        allStudents.add(s7);
        allStudents.add(s8);
        allStudents.add(s9);
        allStudents.add(s10);
        allStudents.add(s11);
        allStudents.add(s12);
        allStudents.add(s13);
        allStudents.add(s14);
        allStudents.add(s15);
        allStudents.add(s16);
        allStudents.add(s17);
        allStudents.add(s18);
        allStudents.add(s19);
        allStudents.add(s20);

        return allStudents;
    }

    public static ArrayList<Trainer> synthTrainers() {
        ArrayList allTrainers = new ArrayList<>();
        Trainer s = new Trainer("Jack", "Jackson", "Java");
        Trainer s1 = new Trainer("James", "Jameson", "C#");
        Trainer s2 = new Trainer("Dick", "Dickson", "Java");
        Trainer s3 = new Trainer("Jane", "Janeson", "C#");
        Trainer s4 = new Trainer("Kostas", "Kostasson", "Java");
        Trainer s5 = new Trainer("Greg", "Gregson", "C#");
        Trainer s6 = new Trainer("Yvonne", "Yvonneson", "Java");
        Trainer s7 = new Trainer("Katherine", "Katherineson", "C#");
        Trainer s8 = new Trainer("Ilya", "Ilyason", "Java");
        Trainer s9 = new Trainer("Bill", "Billson", "C#");
        Trainer s10 = new Trainer("John", "Johnson", "Java");
        Trainer s11 = new Trainer("Annabelle", "Annabelleson", "C#");
        Trainer s12 = new Trainer("Dimitry", "Shulginski", "Java");
        Trainer s13 = new Trainer("Giorno", "Giovanna", "C#");
        Trainer s14 = new Trainer("Star", "Platinum", "Java");
        Trainer s15 = new Trainer("IhaveNoIdea", "WhatIamDoing", "C#");
        allTrainers.add(s);
        allTrainers.add(s1);
        allTrainers.add(s2);
        allTrainers.add(s3);
        allTrainers.add(s4);
        allTrainers.add(s5);
        allTrainers.add(s6);
        allTrainers.add(s7);
        allTrainers.add(s8);
        allTrainers.add(s9);
        allTrainers.add(s10);
        allTrainers.add(s11);
        allTrainers.add(s12);
        allTrainers.add(s13);
        allTrainers.add(s14);
        allTrainers.add(s15);

        return allTrainers;
    }

    public static ArrayList<Course> synthCourses() {
        ArrayList<Course> allCourses = new ArrayList<>();
        Course c = new Course("Java", "Full Time", (LocalDate.of(2020, Month.JANUARY, 01)), (LocalDate.of(2020, Month.MARCH, 30)));
        Course c1 = new Course("Java", "Part Time", (LocalDate.of(2020, Month.JANUARY, 01)), (LocalDate.of(2020, Month.JUNE, 30)));
        Course c2 = new Course("C#", "Full Time", (LocalDate.of(2020, Month.JANUARY, 01)), (LocalDate.of(2020, Month.MARCH, 30)));
        Course c3 = new Course("C#", "Part Time", (LocalDate.of(2020, Month.JANUARY, 01)), (LocalDate.of(2020, Month.JUNE, 30)));
        allCourses.add(c);
        allCourses.add(c1);
        allCourses.add(c2);
        allCourses.add(c3);
        return allCourses;
    }

    public static ArrayList<Assignment> synthAssignments() {
        ArrayList<Assignment> allAssignments = new ArrayList<>();
        Assignment a = new Assignment("Individual assignment 1", "Create minecraft in 1 day", (LocalDate.of(2020, Month.JANUARY, 15)), 20, 80);
        Assignment a1 = new Assignment("Individual assignment 2", "Is this a Jo-jo reference?", (LocalDate.of(2020, Month.FEBRUARY, 15)), 20, 80);
        Assignment a2 = new Assignment("Individual assignment 3", "Make a database that works", (LocalDate.of(2020, Month.MARCH, 25)), 20, 80);
        Assignment a3 = new Assignment("Individual assignment 4", "Do what thou Wilt shall be the whole of the Law", (LocalDate.of(2020, Month.APRIL, 15)), 20, 80);
        Assignment a4 = new Assignment("Individual assignment 5", "Prepare to cry in front of your pc as you try and create this one", (LocalDate.of(2020, Month.MAY, 15)), 20, 80);
        Assignment a5 = new Assignment("Group assignment 1", "Cooperate to do whatever", (LocalDate.of(2020, Month.JUNE, 25)), 20, 80);
        Assignment a6 = new Assignment("Group assignment 2", "Create your own programming language", (LocalDate.of(2020, Month.MARCH, 25)), 20, 80);
        allAssignments.add(a);
        allAssignments.add(a1);
        allAssignments.add(a2);
        allAssignments.add(a3);
        allAssignments.add(a4);
        allAssignments.add(a5);
        allAssignments.add(a6);

        Assignment aa = new Assignment("Individual assignment 1", "What is love?", (LocalDate.of(2020, Month.JANUARY, 15)), 20, 80);
        Assignment aa1 = new Assignment("Individual assignment 2", "Baby don't hurt me", (LocalDate.of(2020, Month.FEBRUARY, 15)), 20, 80);
        Assignment aa2 = new Assignment("Individual assignment 3", "Don't hurt me!", (LocalDate.of(2020, Month.MARCH, 25)), 20, 80);
        Assignment aa3 = new Assignment("Individual assignment 4", "No more!", (LocalDate.of(2020, Month.APRIL, 15)), 20, 80);
        Assignment aa4 = new Assignment("Individual assignment 5", "OoooOOoooOOh~!!", (LocalDate.of(2020, Month.MAY, 15)), 20, 80);
        Assignment aa5 = new Assignment("Group assignment 1", "Create a web-app", (LocalDate.of(2020, Month.JUNE, 25)), 20, 80);
        Assignment aa6 = new Assignment("Group assignment 2", "Learn to work together without fighting", (LocalDate.of(2020, Month.MARCH, 25)), 20, 80);
        allAssignments.add(aa);
        allAssignments.add(aa1);
        allAssignments.add(aa2);
        allAssignments.add(aa3);
        allAssignments.add(aa4);
        allAssignments.add(aa5);
        allAssignments.add(aa6);

        return allAssignments;
    }

    public static ArrayList<Student> addToCourseS1(ArrayList<Student> studentList) {
        ArrayList<Student> studentsc1 = new ArrayList<>();
        studentsc1.add(studentList.get(0));
        studentsc1.add(studentList.get(2));
        studentsc1.add(studentList.get(3));
        studentsc1.add(studentList.get(4));
        studentsc1.add(studentList.get(5));
        studentsc1.add(studentList.get(6));

        return studentsc1;
    }

    public static ArrayList<Student> addToCourseS2(ArrayList<Student> studentList) {
        ArrayList<Student> studentsc2 = new ArrayList<>();
        studentsc2.add(studentList.get(7));
        studentsc2.add(studentList.get(8));
        studentsc2.add(studentList.get(9));
        studentsc2.add(studentList.get(10));

        return studentsc2;
    }

    public static ArrayList<Student> addToCourseS3(ArrayList<Student> studentList) {
        ArrayList<Student> studentsc3 = new ArrayList<>();
        studentsc3.add(studentList.get(11));
        studentsc3.add(studentList.get(12));
        studentsc3.add(studentList.get(13));
        studentsc3.add(studentList.get(14));
        studentsc3.add(studentList.get(16));
        studentsc3.add(studentList.get(17));
        return studentsc3;
    }

    public static ArrayList<Student> addToCourseS4(ArrayList<Student> studentList) {
        ArrayList<Student> studentsc4 = new ArrayList<>();
        studentsc4.add(studentList.get(20));
        studentsc4.add(studentList.get(15));
        studentsc4.add(studentList.get(19));
        studentsc4.add(studentList.get(18));
        studentsc4.add(studentList.get(3));
        studentsc4.add(studentList.get(1));
        return studentsc4;
    }

    public static ArrayList<Assignment> addToCourseA1(ArrayList<Assignment> assignmentList) {
        ArrayList<Assignment> assignmentsc1 = new ArrayList<>();
        assignmentsc1.add(assignmentList.get(0));
        assignmentsc1.add(assignmentList.get(1));
        assignmentsc1.add(assignmentList.get(2));
        assignmentsc1.add(assignmentList.get(6));

        return assignmentsc1;
    }

    public static ArrayList<Assignment> addToCourseA2(ArrayList<Assignment> assignmentList) {
        ArrayList<Assignment> assignmentsc2 = new ArrayList<>();
        assignmentsc2.add(assignmentList.get(0));
        assignmentsc2.add(assignmentList.get(1));
        assignmentsc2.add(assignmentList.get(2));
        assignmentsc2.add(assignmentList.get(3));
        assignmentsc2.add(assignmentList.get(4));
        assignmentsc2.add(assignmentList.get(5));
        assignmentsc2.add(assignmentList.get(6));

        return assignmentsc2;
    }

    public static ArrayList<Assignment> addToCourseA3(ArrayList<Assignment> assignmentList) {
        ArrayList<Assignment> assignmentsc3 = new ArrayList<>();
        assignmentsc3.add(assignmentList.get(7));
        assignmentsc3.add(assignmentList.get(8));
        assignmentsc3.add(assignmentList.get(9));
        assignmentsc3.add(assignmentList.get(13));
        return assignmentsc3;
    }

    public static ArrayList<Assignment> addToCourseA4(ArrayList<Assignment> assignmentList) {
        ArrayList<Assignment> assignmentsc4 = new ArrayList<>();
        assignmentsc4.add(assignmentList.get(7));
        assignmentsc4.add(assignmentList.get(8));
        assignmentsc4.add(assignmentList.get(9));
        assignmentsc4.add(assignmentList.get(10));
        assignmentsc4.add(assignmentList.get(11));
        assignmentsc4.add(assignmentList.get(12));
        assignmentsc4.add(assignmentList.get(13));
        return assignmentsc4;
    }

    public static ArrayList<Trainer> addToCourseT1(ArrayList<Trainer> trainerList) {
        ArrayList<Trainer> trainersc1 = new ArrayList<>();
        trainersc1.add(trainerList.get(0));
        trainersc1.add(trainerList.get(1));
        trainersc1.add(trainerList.get(2));
        trainersc1.add(trainerList.get(3));
        trainersc1.add(trainerList.get(4));
        trainersc1.add(trainerList.get(5));

        return trainersc1;
    }

    public static ArrayList<Trainer> addToCourseT2(ArrayList<Trainer> trainerList) {
        ArrayList<Trainer> trainersc2 = new ArrayList<>();
        trainersc2.add(trainerList.get(6));
        trainersc2.add(trainerList.get(7));

        return trainersc2;
    }

    public static ArrayList<Trainer> addToCourseT3(ArrayList<Trainer> trainerList) {
        ArrayList<Trainer> trainerc3 = new ArrayList<>();
        trainerc3.add(trainerList.get(8));
        trainerc3.add(trainerList.get(9));
        trainerc3.add(trainerList.get(10));
        trainerc3.add(trainerList.get(11));
        trainerc3.add(trainerList.get(12));
        trainerc3.add(trainerList.get(13));
        return trainerc3;
    }

    public static ArrayList<Trainer> addToCourseT4(ArrayList<Trainer> trainerList) {
        ArrayList<Trainer> trainersc4 = new ArrayList<>();
        trainersc4.add(trainerList.get(14));
        trainersc4.add(trainerList.get(15));

        return trainersc4;
    }

}
