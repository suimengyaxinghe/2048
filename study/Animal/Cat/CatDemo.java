package Animal.Cat;

public class CatDemo {
    public static void main(String[] args) {
        Animal a = new Cat();//向上转型
        System.out.println(a.age);
        //System.out.println(a.weight);
        a.eat();


        /*
        Cat c = new Cat();
        c.eat()
         */
        Cat c = (Cat)a;//向下转型，这里的a是上面的Animal a
        c.eat();
    }
}
