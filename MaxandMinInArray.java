public class MaxandMinInArray {
    public static void main(String args[]){
        int arr[] = {14,82,83,48,53};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum number in the array is: "+max);

        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum number in the array: "+min);
    }
}
