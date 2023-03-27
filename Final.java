final class Java{
    final void calc(){
        final int a=10;
        final int b=5;

        System.out.println(a+b);
    }
}

public class Final {
    public static void main(String[] args) {
        Java j1=new Java();
        j1.calc();

        int arr[]={1,2,3,4,5};
        for(final int i:arr){
            System.out.println(i +" ");
        }

        int temp=5;
        for(int i=1;i<=temp;i++){
            for(int j=temp;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        String str="Madam";
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr=revstr+str.charAt(i);
        }
        if(str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}