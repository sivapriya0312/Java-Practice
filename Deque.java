import java.util.*;
public class Deque {
    public static void main(String args[]){
                ArrayDeque<String> dq = new ArrayDeque<String>();
                dq.add("am");
                dq.addFirst("I");
                dq.addLast("Full Stack");
                dq.add("Intern");

                for (Iterator itr = dq.iterator();
                     itr.hasNext();) {
                    System.out.println(itr.next() + " ");
                }

                for (Iterator itr = dq.descendingIterator();
                     itr.hasNext();) {
                    System.out.println(itr.next() + " ");
                }
            }
        }

