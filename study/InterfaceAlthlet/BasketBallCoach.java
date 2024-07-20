package InterfaceAlthlet;

public class BasketBallCoach extends Coach{
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("篮球教练吃的教练餐");
    }

    public void coach() {
        System.out.println("篮球教练教篮球");
    }
}
