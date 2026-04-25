import java.util.List;

public class Lesson {
    private String title;
    private int duration; // in minutes
    private List<Video> videos;

    public Lesson(String title, int duration) {
        this.title = title;
        this.videos = new java.util.ArrayList<>();
    }

    public void addVideo(String title) {
        // composition
        videos.add(new Video(title));
    }

    @Override
    public String toString() {
        return "Lesson: " + title + " (" + duration + " minutes)";
    }
}
