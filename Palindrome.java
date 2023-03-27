import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
//        System.out.println(rev);
        if(org_num==rev){
            System.out.println("It is a Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
