package models;

import functions.Injector;
import java.util.Scanner;
import functions.Maker;
import functions.Synthetic;

public final class Menu {

    School school = new School();
    private int c;
    private boolean startLoop = true;

    public Menu() {
        this.introduction();
    }

    public void introduction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! Would you like to use SYNTHETIC or CUSTOM data?");
        System.out.print("\n");
        System.out.println("Be aware that if you choose custom you will not be able to add the synthetic data later.");
        System.out.print("\n");
        System.out.println("But, if you choose synthetic you can later add your own custom data to it.");
        System.out.print("\n");
        System.out.println("What is your choice?");
        String choice = sc.next();
        while (!choice.equalsIgnoreCase("custom") && !(choice.equalsIgnoreCase("synthetic"))) {
            System.out.println("Wrong input. Type Custom or Synthtic and press enter.");
            choice = sc.next();
        }
        if (choice.equalsIgnoreCase("Custom")) {
            this.mainMenu();
        } else if (choice.equalsIgnoreCase("Synthetic")) {
            this.syntheticData();
            this.mainMenu();
        }
    }

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);
        String inf = "+--------------------------------------------------------+\n"
                + "|     Welcome to the Private School management system    |\n"
                + "+--------------------------------------------------------+\n"
                + "|        PLEASE TYPE YOUR SELECTION AND PRESS ENTER      |\n"
                + "+--------------------------------------------------------+\n"
                + "|  1. Admin                                              |\n"
                + "|  2. User                                               |\n"
                + "|  3. Exit                                               |\n"
                + "+--------------------------------------------------------+";
        System.out.println(inf);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid argument. Input '1-3'");
            sc.next();
        }
        c = sc.nextInt();
        while (!(c == 1) && !(c == 2) && !(c == 3)) {
            System.out.println("Invalid argument. Input '1-3'.");
            c = sc.nextInt();
        }
        switch (c) {
            case 1:
                adminMenu();
                break;
            case 2:
                userMenu();
                break;
            case 3:
                System.out.println("See you :)");
                System.exit(0);
                break;
        }
    }

    public void adminMenu() {
        Scanner sc = new Scanner(System.in);

        String inf = "+---------------------------------------------------------+\n"
                + "|             Welcome to the Admin menu.                  |\n"
                + "+---------------------------------------------------------+\n"
                + "|    You may manage the school by creating new courses,   |\n"
                + "|    students, trainers and manage assignments.           |\n"
                + "|---------------------------------------------------------+\n"
                + "|       PLEASE TYPE YOUR SELECTION AND PRESS ENTER        |\n"
                + "+---------------------------------------------------------+\n"
                + "|  1.  Create new course                                  |\n"
                + "|  2.  Create new student                                 |\n"
                + "|  3.  Create new trainer                                 |\n"
                + "|  4.  Create new assignment                              |\n"
                + "|  5.  Add existing students to course                    |\n"
                + "|  6.  Add existing trainers to course                    |\n"
                + "|  7.  Add existing assignments to course                 |\n"
                + "|  8.  Automatically distribute existing assignments      |\n"
                + "|      in a course to the students of that course         |\n"
                + "|  9.  Return to central menu hub                         |\n"
                + "|  10. EXIT the program                                   |\n"
                + "+---------------------------------------------------------+";
        System.out.println(inf);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid argument. Input '1-10'.");
            sc.next();
        }
        c = sc.nextInt();
        while (c < 1 || c > 10) {
            System.out.println("Invalid argument. Input '1-10'.");
            c = sc.nextInt();
        }

        String answer = "";
        while (startLoop) {
            switch (c) {
                case 1:
                    System.out.println("Do you want to create a Course? Yes / No");
                    answer = sc.next();
                    while (answer.equalsIgnoreCase("yes")) {
                        Course course = Maker.courseMaker();
                        System.out.println(course.toString());
                        school.courseList.add(course);
                        System.out.println("Do you want to create another Course? Yes / No");
                        answer = sc.next();
                    }
                    if (answer.equalsIgnoreCase("No")) {
                        adminMenu();
                    }
                    break;
                case 2:
                    System.out.println("Do you want to create a Student? Yes / No");
                    answer = sc.next();
                    while (answer.equalsIgnoreCase("yes")) {
                        Student student = Maker.studentMaker();
                        school.courseList.forEach(System.out::println);
                        System.out.println("Select the course you want to add the student to (the numbering starts from 0) OR type 100 to abort");
                        while (!sc.hasNextInt()) {
                            System.out.println("Invalid input. Enter a valid integer number that corresponds to the course you want");
                            System.out.println("OR type 100 to abort");
                            sc.next();
                        }
                        int i = sc.nextInt();
                        while (i < 0 || (i >= school.getCourseList().size() && i != 100)) {
                            System.out.println("Course does not exist");
                            i = sc.nextInt();
                        }
                        if (i == 100) {
                            System.out.println("Aborting...");
                            adminMenu();
                        }
                        school.getCourseList().get(i).getStudentsPerCourse().add(student);
                        System.out.println("Student added to course");
                        school.studentList.add(student);
                        System.out.println("Do you want to create another Student? Yes / No");
                        answer = sc.next();
                    }
                    if (answer.equalsIgnoreCase("No")) {
                        adminMenu();
                    }

                    break;
                case 3:
                    System.out.println("Do you want to create a Trainer? Yes / No");
                    answer = sc.next();
                    while (answer.equalsIgnoreCase("yes")) {
                        Trainer trainer = Maker.trainerMaker();
                        school.courseList.forEach(System.out::println);
                        System.out.println("Select the course you want to add the trainer to (the numbering starts from 0) OR type 100 to abort");
                        while (!sc.hasNextInt()) {
                            System.out.println("Invalid input. Enter a valid integer number that corresponds to the course you want");
                            System.out.println("OR type 100 to abort");
                            sc.next();
                        }
                        int i = sc.nextInt();
                        while (i < 0 || (i >= school.getCourseList().size() && i != 100)) {
                            System.out.println("Course does not exist");
                            i = sc.nextInt();
                        }
                        if (i == 100) {
                            System.out.println("Aborting...");
                            adminMenu();
                        }
                        school.getCourseList().get(i).getTrainersPerCourse().add(trainer);
                        System.out.println("Trainer added to course");
                        school.trainerList.add(trainer);
                        System.out.println("Do you want to create another trainer? Yes / No");
                        answer = sc.next();
                    }
                    if (answer.equalsIgnoreCase("No")) {
                        adminMenu();
                    }

                    break;
                case 4:
                    System.out.println("Do you want to create an Assignment? Yes / No");
                    answer = sc.next();
                    while (answer.equalsIgnoreCase("yes")) {
                        System.out.println("Create an assignment: ");
                        Assignment assignment = Maker.assignmentMaker();
                        school.courseList.forEach(System.out::println);
                        System.out.println("Select the course you want to add the assignment to (the numbering starts from 0) OR type 100 to abort.");
                        while (!sc.hasNextInt()) {
                            System.out.println("Invalid input. Enter a valid integer number that corresponds to the course you want");
                            System.out.println("OR type 100 to abort.");
                            sc.next();
                        }
                        int i = sc.nextInt();
                        while (i < 0 || (i >= school.getCourseList().size() && i != 100)) {
                            System.out.println("Course does not exist.");
                            i = sc.nextInt();
                        }
                        if (i == 100) {
                            System.out.println("Aborting...");
                            adminMenu();
                        }
                        school.getCourseList().get(i).getAssignmentsPerCourse().add(assignment);
                        System.out.println("Assignment added to course");
                        school.assignmentList.add(assignment);
                        System.out.println("Do you want to create another assignment? Yes / No");
                        answer = sc.next();
                    }

                    if (answer.equalsIgnoreCase("No")) {
                        adminMenu();
                    }
                    break;
                case 5:
                    school.getCourseList().stream().map(course -> {
                        System.out.println("Do you want to add students to " + course.getTitle() + " " + course.getStream() + "?");
                        return course;
                    }).forEachOrdered(course -> {
                        String a = sc.next();
                        if (a.equalsIgnoreCase("Yes")) {
                            course.getStudentsPerCourse().addAll((Injector.addStudentsToCourse(school.getStudentList())));
                            System.out.println("Students added");
                        } else if (a.equalsIgnoreCase("No")) {
                            System.out.println("Ok, proceeding to next course...");
                        }
                    });
                    adminMenu();

                    break;

                case 6:
                    school.getCourseList().stream().map(course -> {
                        System.out.println("Do you want to add trainers to " + course.getTitle() + " " + course.getStream() + "?");
                        return course;
                    }).forEachOrdered(course -> {
                        String a = sc.next();
                        if (a.equalsIgnoreCase("Yes")) {
                            course.getTrainersPerCourse().addAll((Injector.addTrainersToCourse(school.getTrainersList())));
                            System.out.println("Trainers added");
                        } else if (a.equalsIgnoreCase("No")) {
                            System.out.println("Ok, proceeding to next course...");
                        }
                    });
                    adminMenu();

                    break;

                case 7:
                    school.getCourseList().stream().map(course -> {
                        System.out.println("Do you want to add assignments to " + course.getTitle() + " " + course.getStream() + "?");
                        return course;
                    }).forEachOrdered(course -> {
                        String a = sc.next();
                        if (a.equalsIgnoreCase("Yes")) {
                            course.getAssignmentsPerCourse().addAll((Injector.addAssignmentsToCourse(school.getAssignmentList())));
                            System.out.println("Assignments added");
                        } else if (a.equalsIgnoreCase("No")) {
                            System.out.println("Ok, proceeding to next course...");
                        }
                    });
                    adminMenu();

                    break;

                case 8:
                    for (int i = 0; i < school.getCourseList().size(); i++) {
                        for (Student student : school.getCourseList().get(i).getStudentsPerCourse()) {
                            student.setAssignmentsPerStudent(school.getCourseList().get(i).getAssignmentsPerCourse());
                            System.out.println("Assignments distributed to students in course " + school.getCourseList().get(i).getTitle()
                                    + " " + school.getCourseList().get(i).getStream());
                        }
                    }
                    adminMenu();

                    break;
                case 9:
                    mainMenu();
                    break;
                case 10:
                    startLoop = false;
                    System.out.println("So long :)");
                    System.exit(0);
                    break;

            }
        }

    }

    public void userMenu() {
        Scanner sc = new Scanner(System.in);

        String inf = "+--------------------------------------------------------+\n"
                + "|               Welcome to the User menu.                |\n"
                + "+--------------------------------------------------------+\n"
                + "|    You may view already existing entries, such as      |\n"
                + "|    courses, students, trainers and assignments         |\n"
                + "+--------------------------------------------------------+\n"
                + "|        PLEASE TYPE YOUR SLECTION AND PRESS ENTER       |\n"
                + "+--------------------------------------------------------+\n"
                + "|  1.  View all courses                                  |\n"
                + "|  2.  View all students                                 |\n"
                + "|  3.  View all trainers                                 |\n"
                + "|  4.  View all assignments                              |\n"
                + "|  5.  View all students per course                      |\n"
                + "|  6.  View all trainers per course                      |\n"
                + "|  7.  View all assignments per course                   |\n"
                + "|  8.  View all assignments per course per student       |\n"
                + "|  9.  Return to central menu hub                        |\n"
                + "|  10. EXIT the program                                  |\n"
                + "+--------------------------------------------------------+";
        System.out.println(inf);
        while (startLoop) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid argument. Input '1-10'.");
                sc.next();
            }
            c = sc.nextInt();
            while (c < 1 || c > 10) {
                System.out.println("Invalid argument. Input '1-10'.");
                c = sc.nextInt();
            }

            switch (c) {
                case 1:
                    boolean pac = school.getCourseList().isEmpty();
                    if (pac == true) {
                        System.out.println("There are no courses in this school");
                    } else if (pac == false) {
                        System.out.println("All courses are:");
                        System.out.print("\n");
                        school.courseList.forEach(System.out::println);
                        userMenu();
                    }
                    break;
                case 2:

                    boolean pas = school.getStudentList().isEmpty();
                    if (pas == true) {
                        System.out.println("There are no students in this school");
                    } else if (pas == false) {
                        System.out.println("All students are:");
                        System.out.print("\n");
                        school.studentList.forEach(System.out::println);
                        userMenu();
                    }
                    break;
                case 3:
                    boolean pat = school.getTrainersList().isEmpty();
                    if (pat == true) {
                        System.out.println("There are no trainers in this school");
                    } else if (pat == false) {
                        System.out.println("All trainers are:");
                        System.out.print("\n");
                        school.trainerList.forEach(System.out::println);
                        userMenu();
                    }
                    break;
                case 4:
                    boolean paa = school.getAssignmentList().isEmpty();
                    if (paa == true) {
                        System.out.println("There are no assignments in this school");
                    } else if (paa == false) {
                        System.out.println("All Assignments are:");
                        System.out.print("\n");
                        school.assignmentList.forEach(System.out::println);
                        userMenu();
                    }
                    break;
                case 5:
                    boolean pspc = school.getCourseList().isEmpty();
                    if (pspc == true) {
                        System.out.println("There are no courses in this school");
                    } else if (pspc == false) {
                        System.out.println("All student per course are:");
                        System.out.print("\n");
                        for (int i = 0; i < school.getCourseList().size(); i++) {
                            System.out.println("For the course " + school.getCourseList().get(i).getTitle() + " " + school.getCourseList().get(i).getStream() + " the students are: ");
                            school.getCourseList().get(i).getStudentsPerCourse().forEach(System.out::println);
                            System.out.print("\n");
                        }
                        userMenu();
                    }
                    break;
                case 6:
                    boolean ptpc = school.getCourseList().isEmpty();
                    if (ptpc == true) {
                        System.out.println("There are no courses in this school");
                    } else if (ptpc == false) {

                        System.out.println("All trainers per course are:");
                        System.out.print("\n");
                        for (int i = 0; i < school.getCourseList().size(); i++) {
                            System.out.println("For the course " + school.getCourseList().get(i).getTitle() + " " + school.getCourseList().get(i).getStream() + " the trainers are: ");
                            school.getCourseList().get(i).getTrainersPerCourse().forEach(System.out::println);
                            System.out.print("\n");
                        }
                        userMenu();
                    }
                    break;
                case 7:
                    boolean papc = school.getCourseList().isEmpty();
                    if (papc == true) {
                        System.out.println("There are no courses in this school");
                    } else if (papc == false) {
                        System.out.println("All assignments per course are:");
                        System.out.print("\n");
                        for (int i = 0; i < school.getCourseList().size(); i++) {

                            System.out.println("For the course " + school.getCourseList().get(i).getTitle() + " " + school.getCourseList().get(i).getStream() + " the assignments are: ");
                            school.getCourseList().get(i).getAssignmentsPerCourse().forEach(System.out::println);
                            System.out.print("\n");

                        }
                        userMenu();
                    }
                    break;
                case 8:
                    boolean paps = school.getAssignmentList().isEmpty();
                    if (paps == true) {
                        System.out.println("There are no assignments in this school");
                    } else if (paps == false) {
                        System.out.println("All assignments per student per course are:");
                        System.out.print("\n");
                        for (int i = 0; i < school.getCourseList().size(); i++) {
                            System.out.print("\n");
                            System.out.println("For the course " + school.getCourseList().get(i).getTitle() + " " + school.getCourseList().get(i).getStream() + " the students are: ");
                            System.out.print("\n");
                            for (int f = 0; f < school.getCourseList().get(i).getStudentsPerCourse().size(); f++) {
                                System.out.print("\n");
                                System.out.println("The student " + school.getCourseList().get(i).getStudentsPerCourse().get(f).getFirstName()
                                        + " " + school.getCourseList().get(i).getStudentsPerCourse().get(f).getLastName() + " has the assignments: ");
                                school.getCourseList().get(i).getStudentsPerCourse().get(f).getAssignmentsPerStudent().forEach(System.out::println);
                            }
                        }
                        userMenu();
                    }
                    break;
                case 9:
                    mainMenu();
                    break;
                case 10:
                    startLoop = false;
                    System.out.println("Until next time :)");
                    System.exit(0);
                    break;
            }
        }
    }

    private void syntheticData() {
        school.setStudentList(Synthetic.synthStudents());
        school.setTrainerList(Synthetic.synthTrainers());
        school.setCourseList(Synthetic.synthCourses());
        school.setAssignmentList(Synthetic.synthAssignments());

        school.getCourseList().get(0).setStudentsPerCourse(Synthetic.addToCourseS1(school.getStudentList()));
        school.getCourseList().get(1).setStudentsPerCourse(Synthetic.addToCourseS2(school.getStudentList()));
        school.getCourseList().get(2).setStudentsPerCourse(Synthetic.addToCourseS3(school.getStudentList()));
        school.getCourseList().get(3).setStudentsPerCourse(Synthetic.addToCourseS4(school.getStudentList()));
        school.getCourseList().get(0).setTrainersPerCourse(Synthetic.addToCourseT1(school.getTrainersList()));
        school.getCourseList().get(1).setTrainersPerCourse(Synthetic.addToCourseT2(school.getTrainersList()));
        school.getCourseList().get(2).setTrainersPerCourse(Synthetic.addToCourseT3(school.getTrainersList()));
        school.getCourseList().get(3).setTrainersPerCourse(Synthetic.addToCourseT4(school.getTrainersList()));
        school.getCourseList().get(0).setAssignmentsPerCourse(Synthetic.addToCourseA1(school.getAssignmentList()));
        school.getCourseList().get(1).setAssignmentsPerCourse(Synthetic.addToCourseA2(school.getAssignmentList()));
        school.getCourseList().get(2).setAssignmentsPerCourse(Synthetic.addToCourseA3(school.getAssignmentList()));
        school.getCourseList().get(3).setAssignmentsPerCourse(Synthetic.addToCourseA4(school.getAssignmentList()));
        for (int i = 0; i < school.getCourseList().size(); i++) {
            for (Student student : school.getCourseList().get(i).getStudentsPerCourse()) {
                student.setAssignmentsPerStudent(school.getCourseList().get(i).getAssignmentsPerCourse());
            }
        }
    }
}
