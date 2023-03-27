import java.util.Scanner;

public class NumberOfOddEven {
    public static void main(String args[]){
        int num;
        int odd_count=0;
        int even_count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series of number: ");
        num = sc.nextInt();
        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("Number of even numbers: "+even_count);
        System.out.println("Number of odd numbers: "+odd_count);
    }
}
