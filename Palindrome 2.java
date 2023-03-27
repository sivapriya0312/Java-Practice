import java.util.Scanner;
class Palindrome {
    public static void main(String args[]){
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n= 1221;
        int m=n;
        int a,temp;
        int sum=0;
        temp=m;
        while(m>0){
            a=m%10;
            sum=(sum*10)+a;
            m=m/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
