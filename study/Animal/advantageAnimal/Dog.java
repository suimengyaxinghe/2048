package Animal.advantageAnimal;

public class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void lookdoor(){
        System.out.println("狗看门");
    //这个是狗对象的特有方法，不能在Demo中使用
    //如果想要使用，则需要转型
    }
}
