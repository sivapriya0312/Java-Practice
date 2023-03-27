import java.util.*;
public class LinkedHashset {
    public static void main(String args[]){
        LinkedList<String> lhs = new LinkedList<String>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("A");

        Iterator itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+ " ");
        }

        System.out.println(lhs.isEmpty());

    }
}
