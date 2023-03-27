class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}

class Multithread{
    public static void main(String[] args) {
        Thread1 obj1=new Thread1();
        Thread2 obj2=new Thread2();
        System.out.println(obj2.getId());
        System.out.println(obj2.isAlive());

        obj1.start();
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
        }
        obj2.start();

    }
}