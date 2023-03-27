class Employee{
    void get_name(int a){
        System.out.println("name a"+a);
    }
}

class Details extends Employee{
    void get_name(int a){
        System.out.println("Name: b"+a);
        super.get_name(a);
    }
}

class Method_Overriding{
    public static void main(String1 args[]){
        Details obj = new Details();
        obj.get_name(76567);
    }
}