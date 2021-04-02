import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> mSet1 = new HashSet<>();
        mSet1.add(1);
        mSet1.add(5);
        mSet1.add(11);
        mSet1.add(10);
        mSet1.add(67);
        mSet1.add(20);

        System.out.println("The values of First set are: "+ mSet1);

        Set<Integer> mSet2 = new HashSet<>();
        /** For Other Operations 
        mSet2.add(13);
        mSet2.add(15);
        mSet2.add(11);
        mSet2.add(19);
        mSet2.add(57);
        mSet2.add(60);
        */
        mSet2.add(1);
        mSet2.add(5);
        mSet2.add(11);
        mSet2.add(10);
        mSet2.add(67);
        mSet2.add(20);

        System.out.println("The values of Second set are: " + mSet2);

        // Union  -> mSet1 U mSet2
        Set<Integer> union = new HashSet<>(mSet1);
        union.addAll(mSet2);

        System.out.println("The values of Union Set are: "+union);

        // Intersection 
        Set<Integer> intersection = new HashSet<>(mSet1);
        intersection.retainAll(mSet2);

        System.out.println("The values in the intersection set are: "+intersection);
    
        // Difference -> mSet1 - mSet2
        Set<Integer> difference = new HashSet<>(mSet1);
        difference.removeAll(mSet2);

        System.out.println("The values of the Difference Set is: "+difference);

        // Check for Equals
        System.out.println("Both the Sets are equals?: "+mSet1.equals(mSet2));


        /// Convert List into Set
        List<Integer> mList = new ArrayList<>();
        mList.add(1);    
        mList.add(10);
        mList.add(5);
        mList.add(4);
        mList.add(20);
        mList.add(1); // Duplicate

        System.out.println("The Values of the List are: "+mList);
        Set<Integer> mSet3 = new HashSet<>(mList);
        System.out.println("The values of The List converted into Set: "+mSet3);

        // Iterate through the Set using Iterator
        Iterator<Integer> mIterator = mSet1.iterator();

        while (mIterator.hasNext()){
            System.out.println("The current item in mSet1: "+mIterator.next());
        }
        // Through For each loop
        for (Integer m1: mSet2){
            System.out.println("The current item in mSet2: " + m1);
        }
    }
}
