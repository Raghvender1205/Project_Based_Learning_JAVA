/// This is Part A

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) throws Exception {
        Hashtable<Integer, String> mHashtable = new Hashtable<>();

        mHashtable.put(1, "One");
        mHashtable.put(2, "Two");
        mHashtable.put(3, "Three");
        mHashtable.put(4, "Four");

        System.out.println("The Values of the hashtable are: " + mHashtable);
        mHashtable.remove(2);
        System.out.println(mHashtable.size() + "The values of hashtable now are: "+ mHashtable);

        // Using Enumeration to print out the keys
        Enumeration mEnum = mHashtable.keys();
        
        while (mEnum.hasMoreElements()){
            int key = (int) mEnum.nextElement();
            System.out.println("The Current Key of HashTable is: " + key);
            System.out.println("The Current Value of the HashTable is: "+mHashtable.get(key));
        }
    }
}
