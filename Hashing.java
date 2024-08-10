import java.util.HashSet;
import java.util.Iterator;
//Hashset only contains the unique elements

/*
Time Complexity: 

 Hashsets are extremenly impoertant Data Structures because of its time complexity 
 The time complextixy of all adding , removing or checking elements in the Hashsets is 
 constant as O(1)
 */

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Set will add 1 only one time as it contains only unique elements
        // Size of set
        System.out.println("This size of the set is : " + set.size());

        // printing all elements of the set
        System.out.println(set);

        if (set.contains(1)) {
            System.out.println("This set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("This set doesn't contain 6");
        }

        set.remove(1);
        if (set.contains(1)) {
            System.out.println("This set contains 1");
        } else {
            System.out.println("This set does not contain 1");
        }
        /*
         * In java there is an iterator which has the type of Iterator and can be
         * used by importing the package java.util.Iterator. It has the two function
         * next ; hasnext
         */
        Iterator i = set.iterator();
        while (i.hasNext()) { // hasnext() means when there is element in the set
            // for out understanding we can assume at the first the iterator i is pointing
            // to null
            // and when we use next function it points to the 1 and then 2 and so on
            // but there is not guarantee that it always give the values in sequence
            // because in set the elements can be added in random orders and consider same
            System.out.println(i.next());
        }

    }
}