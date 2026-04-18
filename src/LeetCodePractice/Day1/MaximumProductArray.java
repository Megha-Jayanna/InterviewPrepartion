package LeetCodePractice.Day1;

public class MaximumProductArray {
    int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentProduct < 0) {
                currentProduct = 0;
            }
            currentProduct *= nums[i];
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        MaximumProductArray m = new MaximumProductArray();
//        int[] nums = {2, 3, -2, 4};
        int[] nums= {-2,0,1};
        System.out.println(m.maxProduct(nums));
    }
}
