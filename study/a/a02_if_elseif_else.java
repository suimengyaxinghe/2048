package a;

import java.util.Scanner;
public class a02_if_elseif_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if ( score >=90 && score <= 100) {
            System.out.println("大逼兜");
        } else if (score > 80 && score <= 90) {
            System.out.println("大嘴巴子");
        }else if (score >100) {
            System.out.println("你输入的数字不对，得抽大嘴巴子");
        }else if (score <0) {
            System.out.println("你输入的数字不对，得来个大逼兜");
        }
        else{
                System.out.println("大巴掌");

            }
    }
}