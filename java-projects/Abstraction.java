abstract class Animal
{
    abstract void sound();
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("The Dog Barks");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("The Cat meows");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}
