public class Anagram {
    public static void main(String args[]){
        String s1="BBc";
        String s2="BcB";
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        boolean flag=false;
        if(a1.length==a2.length) {
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a2.length; j++) {
                    if (a1[i] == a2[j]) {
                        flag=true;
                        a2[j]=0;
                    }
                }
            }
        }
        else{
            flag=false;
        }

        if(flag==true){
            System.out.println("The strings are anagram");
        }
        else {
            System.out.println("The strings are not an anagram");
        }
    }
}
