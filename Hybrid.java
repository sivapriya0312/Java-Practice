class A{
    void display(){
        System.out.println("A");
    }
}
class B extends A{
    void display(){
        System.out.println("B");
    }
}
class C extends A{
    void display(){
        System.out.println("C");
    }
}
class D extends B{
    void display(){
        System.out.println("D");
    }
}
class Hybrid {
    public static void main(String1 args[]){
        D a = new D();
        a.display();
    }
}
