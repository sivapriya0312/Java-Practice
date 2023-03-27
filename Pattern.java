
import java.util.*;
public class Pattern{
    public static void main(String arg[]){
        //X pattern
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<=a.length()-1;i++){
            for(int j=0;j<=a.length()-1;j++){
                if(i==j || i+j==a.length() - 1){
                    System.out.print(a.charAt(i));
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        //Matrix
        for(int i=1;i<=2;i++){
            for(int j=0;j<3;j++){
                if((i==1 && j==0)){
                    System.out.print("@");
                }
                else if(i==1 && j==2){
                    System.out.print("@");
                }
                else if(i==2 && j==1){
                    System.out.print("1");
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        //Triangle pattern
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=row;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if((i==4 && k==2) || (i==4 && k==3)){
                    System.out.print("  ");
                }
                else if(i==3 && k==2){
                    System.out.print("  ");
                }
                else{
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }

    }
}

