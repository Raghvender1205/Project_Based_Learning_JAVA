import java.util.Scanner;

public class MenuDemo {
    
    Scanner sc = new Scanner(System.in);
    int option;

    void mainMenu(Manager mManager){
        System.out.println("");        
        System.out.println("!! Main Menu !!");
        System.out.println("1. Add Item");
        System.out.println("2. Insert Item");
        System.out.println("3. Remove Item");
        System.out.println("4. Display Item");
        System.out.println("5. Search Item");

        option = sc.nextInt();
        switch(option) {
            case 1:
                System.out.println("Add Item Area");
                mManager.addItem(sc);
                mainMenu(mManager);
                break;
            case 2:
                System.out.println("Insert Item Area");
                mManager.insertItem(sc);
                mainMenu(mManager);
                break;
            case 3:
                System.out.println("Remove Item Area");
                mManager.deleteItem(sc);
                mainMenu(mManager);
                break;
            case 4:
                System.out.println("Display Item Area");
                mManager.displayItem(sc);
                mainMenu(mManager);
                break;
            case 5:
                System.out.println("Search Item Area");
                mManager.searchItem(sc);
                mainMenu(mManager);
                break;
            
            default:
                System.out.println("Invalid Option has been selected");
                mainMenu(mManager);
        }

    }
}
