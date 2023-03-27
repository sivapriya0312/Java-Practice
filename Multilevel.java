class Circle{
    void circle(){
        System.out.println("Properties of circle");
    }
}

class Area extends Circle{
    void area(){
        System.out.println("pi*r*r");
    }
}
class Perimeter extends Area{
    void peimeter(){
        System.out.println("2*pi*r");
    }
}
class Multilevel {
    public static void main (String1 args[]){
        Perimeter a = new Perimeter();
        a.circle();
        a.peimeter();
        a.area();
    }
}
