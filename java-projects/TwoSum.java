public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {5,6,2};
        int target = 7;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
