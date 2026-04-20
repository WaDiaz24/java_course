import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Video Sharing Platform!");
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your email:");
        String email = scanner.nextLine();

        User user = new User(username, email);
        user.setUsername("Username");
        System.out.println(user.getUsername());

        modifyUser(user);
        System.out.println(user.getUsername());

        LongVideo longVideo = new LongVideo("Long Video Title", "This is a long video description.", true, "Public");
        ShortVideo shortVideo = new ShortVideo("Short Video Title", true, "Private");
        longVideo.reproduce();
        shortVideo.reproduce();

        Video video1 = new ShortVideo();
        ShortVideo video2 = new ShortVideo();

        System.out.println("Title: ");
        String title = scanner.nextLine();
        System.out.println("Description: ");
        String description = scanner.nextLine();
        System.out.println("Visibility (Public/Private): ");
        String visibility = scanner.nextLine();
        System.out.println("Audience (true/false): ");
        boolean audience = scanner.nextBoolean();
        scanner.nextLine(); // Consume the newline character

        Video video;


//        if (description.isEmpty()) {
//            video = new Video(title, audience, visibility);
//        } else {
//            video = new Video(title, description, audience, visibility);
//        }

        System.out.println("Video created successfully!");

    }

    public static void modifyUser(User user ){
        user.setUsername("newUsername");
    }
}