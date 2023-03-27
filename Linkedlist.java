import java.util.*;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String args[]){
        java.util.LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);

        for(int i=6;i<=10;i++){
            System.out.println(ll.add(i));
        }
        System.out.println(ll);

        ll.addFirst(0);
        System.out.println(ll);

        for(int i:ll){
            System.out.println(i);
        }
    }
}
