class Good implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Good");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

        }
    }
}

class Mrng implements Runnable{
    public void run() {
        for(int i=1;i<=5;i++){
        System.out.println("Morning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

        }
    }
}

public class Runnableinterface {
    public static void main(String args[]) {
        Runnable obj1 = new Good();
        Runnable obj2 = new Mrng();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(500);
        } catch (Exception e) {}

        t2.start();
    }
}