import java.util.Scanner;

public class VideoStore {
    Video[] videoStore = new Video[5];
    int i = 0;

    void addVideo(Scanner mScanner) {
        if (videoStore.length > i) {
            System.out.println("");
            System.out.println("Please enter the video name?");
            String name = mScanner.next();
            Video mVideo = new Video(name);

            videoStore[i] = mVideo;
            i = i + 1;
            for (Video video : videoStore) {
                if (video == null) {
                    break;
                }
                System.out.println("The video inserted successfully : " + video.getName());
            }
        } else {
            System.out.println("You don't have sufficient space to insert more videos.");
        }
    }

    void listVideo() {
        System.out.println("");
        System.out.println("SR No.      Video Name        Status        Ratings");
        for (int i = 0; i < videoStore.length; i++) {
            if (videoStore[i] == null) {
                break;
            }
            if (videoStore[i].isStatus()) {
                System.out.println((i + 1) + "      " + videoStore[i].getName() + "        Not available        "
                        + videoStore[i].getRating());
            } else {
                System.out.println((i + 1) + "      " + videoStore[i].getName() + "        Available for rent        "
                        + videoStore[i].getRating());
            }
        }
    }
}