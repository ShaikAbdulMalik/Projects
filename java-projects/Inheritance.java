class Animal extends Object // This is the object class from where all the inherit their feature
{
    void eat ()
    {
        System.out.println("The animal is a Eating");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("The Dog is Barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
    }
}
