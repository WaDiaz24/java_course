public class Main {
    public static void main(String[] args) {
        // Class 6
        System.out.println("Hello world!");
        Course course1 = new Course("Mathematics", "MATH101", 3);
        Course course2 = new Course("Physics", "PHYS101", 4);

        Student student1 = new Student("Alice", "S12345", new Course[]{course1, course2});
        student1.addCourse(new Course[]{course1, course2});
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student Courses:");

    }
}