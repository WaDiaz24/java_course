public class Main {
    public static void main(String[] args) {
        // Class 6
        Course course1 = new Course("Mathematics", "MATH101", 3);
        Course course2 = new Course("Physics", "PHYS101", 4);
        Course course3 = new Course("English", "PHYS101", 4);

        Student student1 = new Student("Alice",  2);
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Courses:");
        for (Course course : student1.getCourses()) {
            if (course != null) {
                System.out.println("- " + course.getName() + " (" + course.getCode() + ", " + course.getCredits() + " credits)");
            }
        }
    }
}