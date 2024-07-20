package Animal.advantageAnimal;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperate ao = new AnimalOperate();
        Cat c = new Cat();
        ao.useAnimal(c);
        Dog d = new Dog();
        ao.useAnimal(d);
        Pig p = new Pig();
        ao.useAnimal(p);


    }
}
