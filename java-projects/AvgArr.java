public class AvgArr {
    public static void main(String[] args) {
        
        int []arr = {1,2,3};
        double avg = 0;
        int n = 0;
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            n = sum += arr[i];
            avg = n/arr.length;
        }
        System.out.println(avg);
    }
}
