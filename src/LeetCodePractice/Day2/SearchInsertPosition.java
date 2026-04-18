package LeetCodePractice.Day2;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(s.searchInsert(nums, target));
    }
}
