package b;

public class b02_array_min {
    public static void main(String[] args) {
        int[]arr={45,25,98,73,60};
        //定义一个变量，用于保存最小值,通常取第一个元素
        int min=arr[0];
        //通用的遍历格式
        for (int x=1;x< arr.length;x++){
            if(arr[x]< min){
                min=arr[x];
            }
        }
        System.out.println(min);
    }
}