package Animal.InterfaceAnimal;

public class AnimalDemo{
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.Jump();
        System.out.println("---------------");
        Cat a = new Cat();
        a.setName("憨憨");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a.Jump();
    }


}
