import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]){
        String rev = " ";
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }
        System.out.println("Reversed String: "+ rev);
    }
}
