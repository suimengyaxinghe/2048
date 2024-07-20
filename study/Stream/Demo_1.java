package Stream;

import java.util.function.IntConsumer;

public class Demo_1 {
    public static void foreachArr(IntConsumer consumer){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            consumer.accept(i);
        }
    }
    public static void main(String[] args) {
        foreachArr((int value) ->{
            System.out.println(value);
        });
    }
}
