import java.util.HashSet;

public class DuplicateElement {
    public static void main(String args[]){
        Boolean status = false;
        int count = 0;
        String ar[] = {"A","B","C","D","A"};

        HashSet <String> h = new HashSet();
        for (String l:ar) {
            if(h.add(l) == false){
                System.out.println("Duplicate Element found "+l);
                status = true;
            }
        }

        if (status == false) {
            System.out.println("No duplicates found");

        }
    }
}
