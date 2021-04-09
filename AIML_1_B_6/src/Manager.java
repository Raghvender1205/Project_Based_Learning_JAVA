import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    List<String> mList = new ArrayList<>();
    List<String> mListSearch = new ArrayList<>();

    void addItem(Scanner sc) {        
        System.out.println("Enter the Item: ");
        String item = sc.next();
        mList.add(item);        
        System.out.println("Item Added");
    }

    void insertItem(Scanner sc) {        
        System.out.println("Enter the Item: ");
        String item = sc.next();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        
        if (index <= mList.size()) {
            mList.add(index, item);
            System.out.println("Item Inserted");
        } else {            
            System.out.println("Given Index is OutOfBound");
        }
    }

    void deleteItem(Scanner sc) {         
        if (mList.size() > 0){
            System.out.println("      S No.          Item        ");
            for (int i=0; i < mList.size(); i++) {
                System.out.println("       " + i + "        " + mList.get(i) + "    ");
            }
        }

        System.out.println("Enter the Index to be deleted: ");
        int index = sc.nextInt();
        mList.remove(index);
        System.out.println("Item removed");
        for (int i=0; i<mList.size(); i++) {
            System.out.println("Available Items: "+mList.get(i));
        }
    }

    void displayItem(Scanner sc){        
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        if (index > 0) {
            System.out.println("Item: " + mList.get(index));
        } else {
            System.err.println("OutOfBound Exception");
        }
    }

    void searchItem(Scanner sc) {         
        System.out.println("Enter the item to Search: ");
        String item = sc.next();
        mListSearch.clear(); // This is to get items that has to be searched for an approach
        for (int i=0; i<mList.size(); i++) {
            if (mList.get(i).contains(item)) {
                mListSearch.add(mList.get(i));
            }
        }

        if (mListSearch.size() > 0) {
            System.out.print("Item Found");
        } else {
            System.err.println("Not Found");
        }

    }
}
