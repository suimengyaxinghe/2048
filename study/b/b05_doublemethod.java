package b;

public class b05_doublemethod {
    public static void main(String[] args) {
    int result1=number(10,20);
        System.out.println(result1);
    int result2=number(10,20,30);
        System.out.println(result2);
    double result3=number(10.0,20.0);
        System.out.println(result3);
    }

    public static int number(int a, int b) {
        return a+b;
    }

    public static int number(int a,int b,int c){
        return a+b+c;
    }
    public static double number(double a,double b){
        return a+b;
    }

}
