import java.util.List;

public class Student {
    private long id;
    private String name;
    private int age;
    private List<Matricula> matriculas; // association

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.matriculas = new java.util.ArrayList<>();
    }

    public void addMatricula(Matricula matricula) {
        // association
        if (matriculas == null) {
            matriculas = new java.util.ArrayList<>();
        }
        matriculas.add(matricula);
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.matriculas = new java.util.ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + age + " years old)";
    }
}
