package a;
public class newtry {
    public static void main(String[] args) {
        int maxnumber =max(10,5);
        System.out.println(maxnumber);
    }

    public static int max(int number1,int number2) {
        if (number1 > number2){
           return number1;
        }else{
            return number2;
        }
    }
}