public abstract class Video {
    protected String title;
    private String description;
    private boolean audience;
    private String visibility;
    private String user;
    private int likes;
    private int dislikes;
    private int views;
    private int days;

    public Video() {
        this.title = "Untitled";
        this.description = "No description";
        this.audience = false;
        this.visibility = "Private";
    }

    public Video(String title, String description, boolean audience, String visibility) {
        this.title = title;
        this.description = description;
        this.audience = audience;
        this.visibility = visibility;
    }

    public Video (String title, boolean audience, String visibility) {
        this.title = title;
        this.audience = audience;
        this.visibility = visibility;
        this.description = "";
        this.user = "";
        this.likes = 0;
        this.dislikes = 0;
        this.views = 0;
        this.days = 0;
    }

    public void reproduce() {
        System.out.println("Reproducing short video: " + getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAudience() {
        return audience;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getUser() {
        return user;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getViews() {
        return views;
    }

    public int getDays() {
        return days;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void giveLike() {
        this.likes++;
    }

    public void giveDislike() {
        this.dislikes++;
    }

    public void giveUnLike() {
        this.likes--;
    }
}
