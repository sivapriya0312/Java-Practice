
import java.util.*;
public class Hashset {
    public static void main(String args[]){

        HashSet<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        System.out.println("Array b-" + a);

        HashSet<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{ 1, 8, 7, 4, 5, 9, 6 }));
        System.out.println("Array a-" + b);

        HashSet<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union" + union);

        HashSet<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection" + intersection);

        HashSet<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference" + difference);
    }
}
