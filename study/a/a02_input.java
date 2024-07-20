package a;
import java.util.Scanner;//将Java.util中的Scannner导包到下面这个类中
public class a02_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建对象
        int a = sc.nextInt();//接收输入的数据
        int b = sc.nextInt();//接收输入的数据
        int c = sc.nextInt();//接收输入的数据
        int tempHeight = a > b ? a : b;
        int heightMax = tempHeight > c ? tempHeight : c;
        System.out.println(heightMax);
    }
}
