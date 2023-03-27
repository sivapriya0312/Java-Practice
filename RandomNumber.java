import java.util.Random;

public class RandomNumber {
    static public void main(String args[]){
        Random rand = new Random();
        int rand_int = rand.nextInt();
        System.out.println(rand_int);

        double dbl_rand = rand.nextDouble();
        System.out.println(dbl_rand);

//        System.out.println(Math.random());
    }
}
