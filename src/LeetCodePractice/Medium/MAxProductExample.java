package LeetCodePractice.Medium;

public class MAxProductExample {
        public int maxProduct(int[] nums) {
            int max_so_far = nums[0];
            int min_so_far = nums[0];
            int result = nums[0];

            for(int i = 1; i < nums.length; i++){
                if(nums[i] > 0){
                    max_so_far = Math.max(max_so_far * nums[i], nums[i]);
                    min_so_far = Math.min(min_so_far * nums[i], nums[i]);
                } else {
                    int temp = max_so_far;
                    max_so_far = Math.max(min_so_far * nums[i], nums[i]);
                    min_so_far = Math.min(temp * nums[i], nums[i]);
                }
                result = Math.max(result, max_so_far);
            }
            return result;
        }

    public static void main(String[] args) {
        MAxProductExample m= new MAxProductExample();
        int[] n= {-3,-1,-1}; //output =3
        System.out.println(m.maxProduct(n));
        int[] n1=  {0,2}; //output 2
        System.out.println(m.maxProduct(n1));
        int[] n3= {-2,0,-1}; //output 0
        System.out.println(m.maxProduct(n3));
        int[] n4={2,3,-2,4}; //output 6
        System.out.println(m.maxProduct(n4));
        int[] n5= {3,-1,4}; //output 4
        System.out.println(m.maxProduct(n5));
        int[] n6= {2,-5,-2,-4,3}; //output 24
        System.out.println(m.maxProduct(n6));
    }
}
