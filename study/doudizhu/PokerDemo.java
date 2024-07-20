package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> box = new ArrayList<String>();
        //创建花色和点数
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",};
        //String[] Joker = {"小王","大王"};
        //往牌盒装牌
        for (String color : colors) {
            for (String number : numbers) {
                box.add(color + number);
            }
        }
        box.add("小王");
        box.add("大王");
        //把牌打散
        Collections.shuffle(box);
        //发牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();
        for (int i = 0; i < box.size(); i++) {
            if (i >= box.size() - 3) {
                dipai.add(box.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(box.get(i));
                }
                if (i % 3 == 1) {
                    player2.add(box.get(i));
                }
                if (i % 3 == 2) {
                    player3.add(box.get(i));
                }
            }
        }
        //看牌
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);
        lookPoker("dipai", dipai);

    }

    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是:");
        for (String Poker : array) {
            System.out.print(Poker + ",");
        }
        System.out.println();
    }
}
