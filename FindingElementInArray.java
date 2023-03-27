import java.util.Scanner;

public class FindingElementInArray {
    public static void main(String args[]){
        int arr[]={1,34,65,76,872,22};
        boolean status=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element: ");
        int userNum=sc.nextInt();

        for(int i=0;i<=arr.length-1;i++){
            if(userNum==arr[i]){
                System.out.println("Element found at: "+ i);
                status=true;
            }
        }
        if(status==false){
            System.out.println("Element not found");
        }
    }
}
