package InterfaceAlthlet;

public class PPCoach extends Coach implements EnglishInter{
    public PPCoach() {
    }

    public PPCoach(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("乒乓球教练吃教练餐");
    }
    public void coach(){
        System.out.println("乒乓球教练教打乒乓球");
    }
    public void English(){
        System.out.println("与乒乓球有关的要学英语");
    }
}
