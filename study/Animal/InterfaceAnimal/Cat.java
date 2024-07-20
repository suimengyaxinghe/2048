package Animal.InterfaceAnimal;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
    @Override
    public void Jump(){
        System.out.println("猫可以跳高了");
        }
}
