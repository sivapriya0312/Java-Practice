//Largest num in array:
/*class Array{
    static int arr[]={1,46,87,8534,24,784,78};
    static int largest(){
        int i;
        int max=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println("The largest number in the array is: "+largest());
*/

//ascending order array
class Array{

    public static void main(String args[]){
        int arr1[]={19,50,8,45,97,56};
        int length= arr1.length;
//        int length = 0;
        System.out.println("The original array : ");
        for(int i=0;i<length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println();

        int temp=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if (arr1[i]>arr1[j]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int i=0;i<length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}