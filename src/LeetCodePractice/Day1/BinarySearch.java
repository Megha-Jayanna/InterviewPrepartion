package LeetCodePractice.Day1;

public class BinarySearch {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] < target) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] nums = {-1,0,4,4,3,5,9,12};
        int target = 4;
        System.out.println(b.search(nums,target));
    }
    }
