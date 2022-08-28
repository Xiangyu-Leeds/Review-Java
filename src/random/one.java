package random;

import java.util.Random;

public class one {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(1000));
        System.out.println(r.nextFloat(10));
        System.out.println(Math.random()*10);
        float a = (float) 1.2;
    }
}
