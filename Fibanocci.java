import java.util.*;
public class Fibanocci{
    public static void main(String args[]){
        int n,n1=0,n2=1,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        System.out.println("The Fibanocci series: ");
        System.out.print(n1+" "+n2+" ");
        for(int i=1;i<=n;i++){
            sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
        }
    }
}