import java.util.Scanner;

public class Launcher {
    Scanner sc = new Scanner(System.in);
    int option;
    public static void main(String args[]) {

		Launcher mLauncher = new Launcher();
        VideoStore mVideoStore = new VideoStore();
        mLauncher.mainMenu(mVideoStore);
    }

	void mainMenu(VideoStore mVideoStore) {

		System.out.println("");
        System.out.println("!!@ Main Menu @!!");
        System.out.println("1. I am an owner");
        System.out.println("2. I am a Customer");
        option = sc.nextInt();

        switch(option) { // For both user and owner mode

			case 1:
                System.out.println("You are in owner area.");
                ownerMenu(mVideoStore);
                break;

			case 2:

				System.out.println("you are in customer area.");
                customerMenu(mVideoStore);
                break;
		}
	}

	
	// owner Menu
	void ownerMenu(VideoStore mVideoStore) {

		System.out.println("");
        System.out.println("!!@@ Owner Menu @@!!");
        System.out.println("1. Add video");
        System.out.println("2. List Inventory");
        System.out.println("3. Return video back");
        System.out.println("4. Get back to main menu");

		option = sc.nextInt();

		switch(option) {
            case 1:
                System.out.println("You are in add video area.");
                mVideoStore.addVideo(sc);
            	ownerMenu(mVideoStore);
                break;

			case 2:
                System.out.println("you are in list video area.");
                mVideoStore.listVideo();
				mVideoStore.takeOnRent(false, sc);
				ownerMenu(mVideoStore);
                break;
			case 3:
				System.out.println("you are in return area.");
                mVideoStore.listVideo();
				mVideoStore.takeOnRent(false, sc); // false -> status = no 
				ownerMenu(mVideoStore);
				break;
			case 4:
				mainMenu(mVideoStore);
				break;
		}
	}

	// Owner Menu
	void customerMenu(VideoStore mVideoStore) {
		System.out.println("");
		System.out.println("!!@ Customer Menu !!@");
		System.out.println("1. List inventory");
		System.out.println("2. Take video on rent");
		System.out.println("3. Provide rating");
		System.out.println("4. Get back to main menu");
	
		option = sc.nextInt();
		switch(option) {
			case 1:
				System.out.println("You are in list video area.");
				mVideoStore.listVideo();
				mVideoStore.takeOnRent(true, sc);
				customerMenu(mVideoStore);
				break;

			case 2:
				System.out.println("you are in rent video area.");
				mVideoStore.listVideo();
				mVideoStore.takeOnRent(true, sc);
				customerMenu(mVideoStore);
				break;

			case 3:
				System.out.println("you are rating video area.");
				mVideoStore.listVideo();
				mVideoStore.provideRating(sc);
				customerMenu(mVideoStore);
				break;
			case 4:
				mainMenu(mVideoStore);
				break;
		}
	}
}