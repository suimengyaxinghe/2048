package a;

import java.util.Scanner;//导包

public class a03_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建对象
        System.out.println("请输入一个月份");
        int month = sc.nextInt();//接收数据
        switch (month){
            case 1/*当month == 1时*/:
            case 2/*当month == 2时*/:
            case 12/*当month == 12时*/:
                System.out.println("冬季");
                break/*打断switch语句*/;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
            default/*当所有数都不相等，执行下面的语句*/:
                System.out.println("你输入的月份有误");
                break;
        }
    }
}
