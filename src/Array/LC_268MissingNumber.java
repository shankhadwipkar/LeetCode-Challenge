package Array;

public class LC_268MissingNumber {
    public static void main(String[] args) {
        int nums[]={3,1,0,2,6,4,5,9,7};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int actualSum = (nums.length * (nums.length + 1)) / 2;
        int missingNumber = actualSum - sum;

        return missingNumber;
    }
}
