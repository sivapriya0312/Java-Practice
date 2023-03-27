import java.util.Arrays;

public class ArraysEqualOrNot {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};

        //without using in-built function
        boolean status=true;
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    status=false;
                }
            }
        }
        else {
            status=false;
        }

        if(status==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }

//          boolean status = Arrays.equals(arr1,arr2);
//        if(status==true){
//            System.out.println("Arrays are equal");
//        }
//        else {
//            System.out.println("Arrays are not equal");
//        }

    }
}
