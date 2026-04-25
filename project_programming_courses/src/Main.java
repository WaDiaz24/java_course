import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static List<Matricula> matriculas = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        do {
            option = showMenu();

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    addTeacher();
                    break;
                case 4:
                    assignTeacher();
                    break;
                case 5:
                    enrollStudentInCourse();
                    break;
                case 6:
                    addLessonToCourse();
                    break;
                case 7:
                    addVideoToLesson();
                    break;
                case 8:
                    option = showMenu();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 9);
    }

    static int showMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. Add Course");
        System.out.println("3. Add Teacher");
        System.out.println("4. Assign Teacher");
        System.out.println("5. Enroll Student in Course");
        System.out.println("6. Add Lesson to Course");
        System.out.println("7. Add Video to Lesson");
        System.out.println("8. Show System");
        System.out.println("9. Exit");
        System.out.println("Select an option: ");
        int option = scanner.nextInt();
        scanner.nextLine();// consume newline
        return option;
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        Student student = new Student(students.size() + 1, name, age);
        students.add(student);
        System.out.println("Student added: " + student);
    }

    static void addCourse() {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        Course course = new Course(courses.size() + 1, name);
        courses.add(course);
        System.out.println("Course added: " + course.getName());
    }

    static void addTeacher() {
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        Teacher teacher = new Teacher(teachers.size() + 1, name);
        teachers.add(teacher);
        System.out.println("Teacher added: " + teacher);
    }

    static void assignTeacher() {
        Course course = selectCourse();
        Teacher teacher = selectTeacher();
        if (course != null && teacher != null) {
            course.assignTeacher(teacher);
            System.out.println("Teacher " + teacher.getName() + " assigned to course " + course.getName());
        } else {
            System.out.println("Course or teacher not found.");
        }
    }

    static void enrollStudentInCourse() {
        Student student = selectStudent();
        Course course = selectCourse();
        if (student != null && course != null) {
            Matricula matricula = new Matricula(matriculas.size() + 1, student, course);
            matriculas.add(matricula);
            student.addMatricula(matricula);
            course.addMatricula(matricula);
            System.out.println("Student " + student.getName() + " enrolled in course " + course.getName());
        } else {
            System.out.println("Student or course not found.");
        }
    }

    static void addLessonToCourse() {
        Course course = selectCourse();
        if (course != null) {
            System.out.print("Enter lesson title: ");
            String title = scanner.nextLine();
            System.out.print("Enter lesson duration (minutes): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // consume newline
            course.addLesson(title, duration);
            System.out.println("Lesson added to course " + course.getName());
        } else {
            System.out.println("Course not found.");
        }
    }

    static void addVideoToLesson() {
        Course course = selectCourse();
        if (course != null) {
            List<Lesson> lessons = course.getLessons();
            if (lessons.isEmpty()) {
                System.out.println("No lessons found for this course.");
                return;
            }
            System.out.println("Select a lesson:");
            for (int i = 0; i < lessons.size(); i++) {
                System.out.println((i + 1) + ". " + lessons.get(i));
            }
            int lessonIndex = scanner.nextInt() - 1;
            scanner.nextLine(); // consume newline
            if (lessonIndex >= 0 && lessonIndex < lessons.size()) {
                Lesson lesson = lessons.get(lessonIndex);
                System.out.print("Enter video title: ");
                String title = scanner.nextLine();
                lesson.addVideo(title);
                System.out.println("Video added to lesson " + lesson);
            } else {
                System.out.println("Invalid lesson selection.");
            }
        } else {
            System.out.println("Course not found.");
        }
    }

    static Student selectStudent() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return null;
        }
        System.out.println("Select a student:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
        int studentIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline
        if (studentIndex >= 0 && studentIndex < students.size()) {
            return students.get(studentIndex);
        } else {
            System.out.println("Invalid student selection.");
            return null;
        }
    }

    static Course selectCourse() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return null;
        }
        System.out.println("Select a course:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i).getName());
        }
        int courseIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline
        if (courseIndex >= 0 && courseIndex < courses.size()) {
            return courses.get(courseIndex);
        } else {
            System.out.println("Invalid course selection.");
            return null;
        }
    }

    static Teacher selectTeacher() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available.");
            return null;
        }
        System.out.println("Select a teacher:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println((i + 1) + ". " + teachers.get(i));
        }
        int teacherIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline
        if (teacherIndex >= 0 && teacherIndex < teachers.size()) {
            return teachers.get(teacherIndex);
        } else {
            System.out.println("Invalid teacher selection.");
            return null;
        }
    }

}