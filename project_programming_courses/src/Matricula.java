public class Matricula {
    private long id;
    private Student student; // association
    private Course course; // association

    public Matricula(long id, Student student, Course course) {
        this.id = id;
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getTeacher() {
        return course;
    }

    @Override
    public String toString() {
        return "Matricula: " + student.getName() + " enrolled with " + course.toString();
    }
}
