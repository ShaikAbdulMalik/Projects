class Animal{
    Animal()
    {
        System.out.println("Animals are living");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super(); // You dont need to call this as its called automatically by JVM and implicitly called 
        System.out.println("Dog is Barking");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.getClass()); // This keyword is used to get the class of the Provided object
    }
}
