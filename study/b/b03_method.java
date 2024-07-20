package b;

public class b03_method {
    public static void main(String[] args) {
        isEvenNumber(10);//换成多个变量时，格式为（a：10，b：20）
    }

    public static void isEvenNumber(int number) {
        //这里的int number可以换成多个变量，比如（int a，int b）
        //这里的方法可以换成所有内容，比如比大小，奇偶数等等
        if (number%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
