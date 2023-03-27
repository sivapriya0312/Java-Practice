class Calc {
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{

}
class Inheritance{
    public static void main (String1 args[]){
        AdvCalc a=new AdvCalc();
        a.add(2,3);
    }
}

