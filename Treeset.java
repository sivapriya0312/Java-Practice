import java.util.*;
public class Treeset {
    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        System.out.println(ts);

        ts.add("A");
        System.out.println(ts);
    }
}
