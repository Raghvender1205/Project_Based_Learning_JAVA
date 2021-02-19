import java.util.Scanner;

public class VideoStore {
    Video[] videoStore = new Video[5];
    int i = 0; //Dynamic index
    
    // Utilities

    // Add Video
    void addVideo(Scanner mScanner) {
        if (videoStore.length > i) { // For indexOutOfRange Error catching
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
 
    // Video List
    void listVideo() {
        System.out.println("");
        System.out.println("SR No.      Video Name        Status        Ratings");
        for (int i = 0; i < videoStore.length; i++) {
            if (videoStore[i] == null) { // for java.lang.NullPointerException
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
    /// @customermethod
    // Rent a Video
    void takeOnRent(boolean status, Scanner sc){
        System.out.println(""); // Status check for the customer
        if(!status){
            System.out.println("Please enter the SR of the video to return it back, Enter 0 to exit");
        }else {
            System.out.println("Please enter the SR of the video to be rented, Enter 0 to exit");
        }

        int i = sc.nextInt();
        if (i != 0){ // Check for status
            if (videoStore[i-1].isStatus() == status){
                if (status){
                    System.out.println("Video is not available for rent, try again");
                }
                else {
                System.out.println("Video is already rented");
                }
            }
            else {
                videoStore[i - 1].setStatus(status);
                if (status){
                    System.out.println("Video has been rented");
                } else{
                    System.out.println("Video has been returned");
                }
                listVideo(); // For showing the VideoList
            }
        }
    }

    /// @customermethod
    // Enter Ratings to the Video 
    void provideRating(Scanner sc){
        System.out.println("");
        System.out.println("Please enter the video SR number for the rating:");
        int i = sc.nextInt();

        System.out.println("Please enter the Rating: ");
        int rating = sc.nextInt();

        if (videoStore[i-1].isStatus()){ // Condition For Status Check
            videoStore[i-1].setRating(rating);
            System.out.println("Video has been rated");
            listVideo();
        }
        else{
            System.out.println("You are not allowed to provide rating");
        }
    }
}