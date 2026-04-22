public class Student {
    private String name;
    private String id;
    private Course[] courses;
    private int courseCount;

    public Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
        }
    }

    public Course[] getCourses() {
        return courses;
    }
}
