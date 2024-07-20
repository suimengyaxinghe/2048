package InterfaceAlthlet;

public class Althlet extends Human{
    public Althlet() {
    }

    public Althlet(String name, int age) {
        super(name, age);
    }
    public void study(){
        System.out.println("运动员要学习");
    }
}
