class Student
{
    private int id;
    private String name;

    public void setid(int id)
    {
        this.id = id;
    }
    public int getId ()
    {
        return id;
    }

    public void setname (String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.setid(100);
        s.setname("Malik");

        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
