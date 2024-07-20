package InterfaceAlthlet;

public class BasketBallAlthlet extends Althlet{
    public BasketBallAlthlet() {
    }

    public BasketBallAlthlet(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("篮球运动员吃运动餐");
    }
    public void study(){
        System.out.println("篮球运动员学习打篮球");
    }
}
