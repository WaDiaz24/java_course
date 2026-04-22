import java.util.List;

public class Lesson {
    private String title;
    private int duration; // in minutes
    private List<Video> videos;

    public Lesson(String title, int duration, List<Video> videos) {
        this.title = title;
        this.duration = duration;
        this.videos = videos;
    }

    public void addVideo(String title) {
        Video video = new Video(title);
        videos.add(video);
    }

    @Override
    public String toString() {
        return "Lesson: " + title + " (" + duration + " minutes)";
    }
}
