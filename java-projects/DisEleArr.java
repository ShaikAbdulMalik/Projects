public class DisEleArr {
    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,4,4,5};
        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0)
            {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
