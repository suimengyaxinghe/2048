package InterfaceAlthlet;

public class Coach extends Human{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public void coach(){
        System.out.println("教练要教东西");
    }
}
