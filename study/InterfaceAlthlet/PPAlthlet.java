package InterfaceAlthlet;

public class PPAlthlet extends Althlet implements EnglishInter {
    public PPAlthlet() {
    }

    public PPAlthlet(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("乒乓球运动员吃运动餐");
    }

    public void study() {
        System.out.println("乒乓球运动员学习打乒乓球");

    }
    public void English(){
        System.out.println("与乒乓球有关的要学习英语");
    }
}
