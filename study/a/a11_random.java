package a;

import java.util.Random;
public class a11_random {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i=0;i<10;i++){
        int number = r.nextInt(100);
        System.out.println(number);
        }
    }
}