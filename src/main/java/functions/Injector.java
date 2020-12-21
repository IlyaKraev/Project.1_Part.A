package functions;

import java.util.ArrayList;
import java.util.Scanner;
import models.Assignment;
import models.Student;
import models.Trainer;

public class Injector {

    public static ArrayList<Student> addStudentsToCourse(ArrayList<Student> studentList) {
        ArrayList<Student> spc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (Student student : studentList) {
            System.out.println("Do you want to add " + student.getFirstName() + " " + student.getLastName() + " to this course? 1 for YES 2 for NO");
            String an = sc.next();
            if (an.equalsIgnoreCase("yes")) {
                spc.add(student);
            } else if (an.equalsIgnoreCase("No")) {
                System.out.println("Proceding to next student...");
            }
        }
        return spc;
    }

    public static ArrayList<Trainer> addTrainersToCourse(ArrayList<Trainer> trainerList) {
        ArrayList<Trainer> tpc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (Trainer trainer : trainerList) {
            System.out.println("Do you want to add " + trainer.getFirstName() + " " + trainer.getLastName() + " to this course? 1 for YES 2 for NO");
            String an = sc.next();
            if (an.equalsIgnoreCase("yes")) {
                tpc.add(trainer);
            } else if (an.equalsIgnoreCase("No")) {
                System.out.println("Proceding to next trainer...");
            }
        }
        return tpc;
    }

    public static ArrayList<Assignment> addAssignmentsToCourse(ArrayList<Assignment> assignmentList) {
        ArrayList<Assignment> apc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (Assignment assignment : assignmentList) {
            System.out.println("Do you want to add " + assignment.getTitle() + " to this course? 1 for YES 2 for NO");
            String an = sc.next();
            if (an.equalsIgnoreCase("yes")) {
                apc.add(assignment);
            } else if (an.equalsIgnoreCase("No")) {
                System.out.println("Proceding to next assignment...");
            }
        }
        return apc;
    }
}
