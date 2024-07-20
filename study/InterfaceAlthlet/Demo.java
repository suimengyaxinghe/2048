package InterfaceAlthlet;

public class Demo {
    public static void main(String[] args) {
        BasketBallAlthlet ba = new BasketBallAlthlet();
        ba.setName("篮球运动员1");
        ba.setAge(35);
        System.out.println(ba.getName()+","+ba.getAge());
        ba.eat();
        ba.study();
        System.out.println("------------------------------");
        BasketBallCoach bc = new BasketBallCoach();
        bc.setAge(40);
        bc.setName("篮球教练1");
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.coach();
        System.out.println("----------------------------------");
        PPAlthlet ppa = new PPAlthlet();
        ppa.setName("乒乓球运动员1");
        ppa.setAge(25);
        System.out.println(ppa.getName()+","+ppa.getAge());
        ppa.eat();
        ppa.study();
        ppa.English();
        System.out.println("------------------------------------");
        PPCoach ppc = new PPCoach();
        ppc.setName("乒乓球教练1");
        ppc.setAge(30);
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.eat();
        ppc.coach();
        ppc.English();

    }
}
