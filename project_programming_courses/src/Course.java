import java.util.List;

public class Course {
    private  long id;
    private String name;
    private Teacher teacher;
    private List<Lesson> lessons;// composition
    private List<Matricula> matriculas; // association

    public Course(long id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.lessons = new java.util.ArrayList<>();
        this.matriculas = new java.util.ArrayList<>();
    }

    public Course(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addLesson(String title, int duration) {
        // composition
        if (lessons == null) {
            lessons = new java.util.ArrayList<>();
        }
        lessons.add(new Lesson(title, duration));
    }

    public void addMatricula(Matricula matricula) {
        // association
        if (matriculas == null) {
            matriculas = new java.util.ArrayList<>();
        }
        matriculas.add(matricula);
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }


}
