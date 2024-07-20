package a;

import java.util.Scanner;//导包
public class a02_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//创建对象
        System.out.println("请输入一个整数");
        int number =sc.nextInt();//接收数据
        if (number%2 == 0/*执行条件，如果为true则执行{}中的内容*/){
            System.out.println(number+"是偶数");
        }
        else{/*当上面为false是执行下面的内容*/
            System.out.println(number+"是奇数");
        }
    }
}
