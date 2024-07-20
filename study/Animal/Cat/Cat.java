package Animal.Cat;

public class Cat extends Animal{
    int age = 20;
    int weight = 30;
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
