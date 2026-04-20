public class ShortVideo extends Video {
     public ShortVideo() {
        super();
    }

    public ShortVideo(String title, String description, boolean audience, String visibility) {
        super(title, description, audience, visibility);
    }

    public ShortVideo(String title, boolean audience, String visibility) {
        super(title, audience, visibility);
    }

    @Override
    public void reproduce() {
        System.out.println("Reproducing short video: " + getTitle());
    }

    public void reproduce(String format) {
        System.out.println("Reproducing short video with format: " + format);
    }
}
