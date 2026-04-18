package LeetCodePractice.Day2;

public class MajorityElement {
//    public int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            count += (num == candidate) ? 1 : -1;
//        }
//
//        return candidate;
//    }

    public int majorityElement(int[] nums) {
        int count=0;
        int fre=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;i<nums.length-1;j++){
            if(nums[i]==nums[j]){
                count ++;
            }else{
                count --;
            }
        }
         fre= Math.max(count,fre);
    }
    return fre;
    }
    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(m.majorityElement(nums));
    }
}
