package LeetCodePractice.Day1;

public class ArrayExample {
public int MaxASubArray(int[] nums) {
    int maxSoFar = nums[0];
    int currentSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (currentSum <= 0) {
            currentSum = 0;
        }
        currentSum += nums[i];

        if (currentSum > maxSoFar) {
            maxSoFar = currentSum;
        }
    }
    return maxSoFar;
}
    public static void main(String[] args) {
        ArrayExample a = new ArrayExample();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(a.MaxASubArray(nums));

    }
}
