import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Map {
    public static void main(String args[]){
        int arr[]=new int[]{1,1,2,3,6,2,1,1};

        HashMap<String,Integer> hm =new HashMap<String, Integer>();
        for(int i=0;i<=7;i++) {
            int x = (int)Array.get(arr, i);
            System.out.print(x+" ");
        }
    }
}
