public class String1 {
    public static void main(String[] args) {
        String str = "Welcome to Javatpoint portal";
        for (int i=0; i<str.length(); i++) {
            if(i%2==0 || i==0) {
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }
    }
}