class Earth{
    void sea(int percentage){
        System.out.println(percentage + "%");
    }
}

class Human extends Earth{
    void human(int percentage){
        System.out.println(percentage + "%");
    }
}

class Animal extends Earth{
    void animal(int percentage){
        System.out.println(percentage + "%");
    }
}

class Hierarchical {
    public static void main(String arg[]){
        Human a = new Human();
        Animal b = new Animal();

        a.human(20);
        b.animal(5);
        a.sea(65);
    }
}
