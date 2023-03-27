class Bike{
    int a;
    String b;
    Bike(int a, String b){
        System.out.println(b+"hi"+a);
    }
    Bike(Bike s){
        int a=s.a;
        String b=s.b;
        System.out.println(b+"hi"+a);

    }
}

public class Constructor {
    public static void main(String1 args[]) {
        Bike obj = new Bike(3," hi");
    }
}
