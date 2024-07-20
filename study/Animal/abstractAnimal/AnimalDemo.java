package Animal.abstractAnimal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("憨憨");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("----------------------------------");
        a = new Cat("憨憨",4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
