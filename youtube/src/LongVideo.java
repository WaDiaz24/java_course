public class LongVideo extends Video implements Monetizable {
     public LongVideo() {
        super();
    }

    public LongVideo(String title, String description, boolean audience, String visibility) {
        super(title, description, audience, visibility);
    }

    public LongVideo(String title, boolean audience, String visibility) {
        super(title, audience, visibility);
    }

    public void reproduce() {
        System.out.println("Reproducing long video: " + getTitle());
    }

    @Override
    public void monetize() {
        System.out.println("Monetizing long video: " + getTitle());
    }
}
