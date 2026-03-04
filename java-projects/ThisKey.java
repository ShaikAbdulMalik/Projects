class Student
{
    int id;//this is the instance variable
    String name;
    Student(int id, String name) // This is the Parameter
    {
        this.id = id; // This calls upon the instance variable
        this.name = name;
    }
    void display()
    {
        System.out.println(id + " " + name);
    }
}
public class ThisKey {
    public static void main(String[] args) {
        Student s = new Student(25, "Malik");
        s.display();
    }
}
