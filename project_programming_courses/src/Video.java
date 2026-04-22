public class Video {
    private String title;
    private int length;

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public Video(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Video: " + title + " (" + length + " minutes)";
    }
}
