class Student 
{
    private int id;
    void setId(int id)
    {
        this.id = id;
    }
    int getid()
    {
        return id;
    }
}
public class setNget {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(10); // Setter 
        System.out.println(s.getid()); // Getter
    }
}
