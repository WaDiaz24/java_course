public class Teacher {
    private long id;
    private String name;

    public Teacher(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + " (ID: " + id + ")";
    }
}
