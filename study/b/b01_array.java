package b;

public class b01_array {
    public static void main(String[] args) {
        int[]arr = new int[3];
        /*
          左边：
            int:说明数组中的元素类型是int类型
            []:说明这是一个数组
            arr：这是数组的名称
          右边：
           new：为数组申请内存空间
           int：说明数组的类型是int类型
           []:说明这是一个数组
         */
        //输出数组名（内存的地址）
        System.out.println(arr);
        //输入数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
