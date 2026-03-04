class player
{
    String name;
    int id;

    static int playerCount = 0;
    player(String name) // Constructor
    {
        this.name = name;
        id = ++playerCount;
    }
    void details()
    {
        System.out.println(id+ " " + name);
    }
}
public class statickey {
    public static void main(String[] args) {
        player p1 = new player("xyz");   
        player p2 = new player("abc");
        
        p1.details();
        p2.details();

        System.out.println(player.playerCount);
    }
}
