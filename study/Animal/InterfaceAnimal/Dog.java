package Animal.InterfaceAnimal;

public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void Jump(){
        System.out.println("狗可以跳高了");
    }
}
