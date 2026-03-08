abstract class Animal
{
    abstract void sound();
}
class Dog extends Animal 
{
    void sound()
    {
        System.out.println("BOW BOW");
    }
}
public class Reference {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        // You can create references of the abstract cclass but not the instance and it can be called accordingly 
        // Same could be done with Interfaces 
        a.sound();
    }
}
