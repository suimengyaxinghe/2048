package b;

public class b04_backnumber {
    public static void main(String[] args) {
        int result = backnumber(10,20);
        System.out.println(result);
        //这两种都可以
        System.out.println(backnumber(10,20));
    }

    public static int backnumber(int a,int b) {
        if (a>b){
        return a;
        }else {
        return b;
        }
    }
}
