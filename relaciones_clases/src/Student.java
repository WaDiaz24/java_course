public class Student {
    private String name;
    private String id;
    private Course[] courses;

    public Student(String name, String id, Course[] courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void addCourse(Course[] course) {
        this.courses = course;

    }
}
