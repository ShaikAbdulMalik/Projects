public class SmallestTernary {
    public static void main(String[] args) {
        int n1 = 121;
        int n2 = 133;
        int n3 = 130;
        int n4 = 150;
        int n5 = 106;

        int res = n1 < n2 || n1 < n3 || n1 < n4 || n1 < n5 ? n2 < n1 ? n2 : n3 < n2 ? n3 : n4 < n3 ? n4 : n4 < n5  ? n5 : n1 : n2;    
        System.out.println(res);
    }
}
