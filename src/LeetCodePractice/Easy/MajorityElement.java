package LeetCodePractice.Easy;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(m.majorityElement(nums));
        int[] nums1 = {2,2,1,1,1,2,4,4,4,2,3,4,4,4,4,3,3,3,3,3,3,4,4,4};
        System.out.println(m.majorityElement(nums1));
    }
}
