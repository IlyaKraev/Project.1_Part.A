package functions;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import models.Course;
import models.Student;
import models.Trainer;
import models.Assignment;

public class Maker {

    public static Course courseMaker() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("What is the title of this course?");
        Course course = new Course();
        String t = sc.nextLine();
        course.setTitle(t);
        System.out.println("What stream is this course? Part time, or Full time?:");
        String s = sc.nextLine();
        course.setStream(s);
        System.out.println("Starting date:");
        String sD = sc.nextLine();
        while (Util.isValid(sD) == false) {
            System.out.println("Invalid date format, try dd/MM/yyyy");
            sD = sc.nextLine();
        }
        course.setStartDate(Util.StringToDate(sD));
        System.out.println("End date:");
        String eD = sc.nextLine();
        while (Util.isValid(eD) == false) {
            System.out.println("Invalid date format, try dd/MM/yyyy");
            eD = sc.nextLine();
        }
        course.setEndDate(Util.StringToDate(eD));

        return course;
    }

    public static Student studentMaker() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Input student first name");
        Student student = new Student();
        String fN = sc.nextLine();
        student.setFirstName(fN);
        System.out.println("Last name:");
        String lN = sc.nextLine();
        student.setLastName(lN);
        System.out.println("Birth date:");
        String dOB = sc.nextLine();
        while (Util.isValid(dOB) == false) {
            System.out.println("Invalid date format, try dd/MM/yyyy");
            dOB = sc.nextLine();
        }
        student.setdOB(Util.StringToDate(dOB));
        System.out.println("Tuition fees paid out of the total 2500");
        student.setTuitionFees(sc.nextInt());
        System.out.println(student.toString());

        return student;
    }

    public static Trainer trainerMaker() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Input trainer first name");
        Trainer trainer = new Trainer();
        String fN = sc.next();
        trainer.setFirstName(fN);
        System.out.println("Last name:");
        String lN = sc.next();
        trainer.setLastName(lN);
        System.out.println("Subject:");
        trainer.setSubject(sc.next());
        System.out.println(trainer.toString());

        return trainer;
    }

    public static Assignment assignmentMaker() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Input Assignment title");
        Assignment assignment = new Assignment();
        String t = sc.nextLine();
        assignment.setTitle(t);
        System.out.println("Description");
        assignment.setDescription(sc.nextLine());
        System.out.println("Sub date");
        String sDt = sc.nextLine();
        while (Util.isValid(sDt) == false) {
            System.out.println("Invalid date format, try dd/MM/yyyy");
            sDt = sc.nextLine();
        }
        assignment.setSubDateTime(Util.StringToDate(sDt));
        System.out.println("Set oral mark");
        assignment.setOralMark(sc.nextInt());
        System.out.println("Set total mark");
        assignment.setTotalMark(sc.nextInt());
        System.out.println(assignment.toString());

        return assignment;
    }
}
