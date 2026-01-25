public class MaxEle {
    public static void main(String[] args) {
        
        int []arr = {1,2,7,6,5,4,3};
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            ans = Math.min(ans, arr[i]); // You can use max for the largest element and min for the smallest element 
        }
        System.out.println(ans);
    }
}
