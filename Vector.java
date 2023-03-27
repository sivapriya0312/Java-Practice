
import java.util.*;

    public class Vector {
        public static void main(String[] args) {
            // Create a new vector
            java.util.Vector<Integer> vc = new java.util.Vector<Integer>();

            // Add elements to the vector
            vc.addElement(1);
            vc.addElement(2);
            vc.addElement(3);
            vc.addElement(4);
            System.out.println(vc);

            vc.insertElementAt(0, 1);
            System.out.println(vc);

            vc.removeElementAt(3);
            System.out.println(vc);

            for (int i : vc) {
                System.out.println(i);
            }

            Collections.replaceAll(vc, 2, 20);
            System.out.println(vc);
        }
    }


