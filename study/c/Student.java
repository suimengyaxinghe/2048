package c;

public class Student {
    String name;
    private int age;//定义成员变量
    public void setAge(int a){
        if (a>120 || a<0){
            System.out.println("你输入的年龄有误");
        }else{
            age = a;
        }
    }
    public int getAge(int a){
        return age;
    }
    public void study(){
        System.out.println("好好学习，天天向上");
    }
    public void dohomework(){
        System.out.println("键盘敲烂，月薪过万");
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
