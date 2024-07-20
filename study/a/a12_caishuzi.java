package a;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class a12_caishuzi {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt() + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请你输入你要猜的数字");
            int guessnumber = sc.nextInt();
            if (guessnumber > number) {
                System.out.println("你猜的数字大了");
            } else if (guessnumber < number) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
