class parent{
    static int a = 10;
    static void disp()
    {
        System.out.println("parents Static method");
    }
    int b = 20;
    void display()
    {
        System.out.println("In non static member");
    }
}
class child extends parent{
    int d = 40;
    void hello()
    {
        System.out.println("Hello, in child class");
    }
    static int c = 30;
    static void method(){
        System.out.println("In child static method");
    }
}

public class Oops {
    public static void main(String[] args) {
        // Accessing Static members :
        // parent class
        parent.disp();
        System.out.println(parent.a);
        //child class 
        child.method();
        System.out.println(child.c);
        // parent members can be called using child className
        child.disp();
        System.out.println(child.a);
        // But child class members cannot be called using the parent className
        //parent.method();
        //System.out.println(parent.c);
        
        // Accessing Non-Static members
        parent p = new parent();
        p.display();
        System.out.println(p.b);
        // child members cannot be accessed using ParentObjectName
        //p.method();
        //System.out.println(p.c);
        // ChildObjectName
        child c = new child();
        c.hello();
        System.out.println(c.d);
        // parent members can be called using child ObjectName
        System.out.println(c.b);
        c.display();

    }
}
