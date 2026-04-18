package LeetCodePractice.Day1;

public class DuplicatesExample {
    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
                return false;
            }


//        HashSet<Integer> set=new HashSet<>();
//
//        for(int i=0; i<nums.length;i++){
//            if(set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//        }
//        return false;
//    }
    public static void main(String[] args) {
        DuplicatesExample d = new DuplicatesExample();
        int[] nums = {1, 2, 3, 1};
        System.out.println(d.containsDuplicate(nums));
    }
}
