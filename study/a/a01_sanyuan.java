package a;

public class a01_sanyuan {
    public static void main(String[] args) {
        int height1=180;
        int height2=200;
        int height3=264;
        int temheight = height1 > height2 ? height1 : height2;//三元运算符，如果height1大于height2，则输出height1，反之则输出height2
        System.out.println(temheight);
        int max= temheight > height3 ?  temheight : height3;//这里是拿前两个的最大值与第三个比较，再取最大值
        System.out.println(max);
    }
}