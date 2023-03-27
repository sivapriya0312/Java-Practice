import java.util.*;
public class PriQueue {
   public static void main(String args[]){
       PriorityQueue<String> q = new PriorityQueue<String>();
       q.add("Sivapriya");
       q.add("Full stack");
       q.add("Intern");
       System.out.println(q);

       Iterator itr = q.iterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }

       System.out.println(q.poll());

       System.out.println(q);
   }
}
