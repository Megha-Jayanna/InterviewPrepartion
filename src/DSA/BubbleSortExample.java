package DSA;

public class BubbleSortExample {
    public static void main(String[] args) {
        int nums[] = {4,3,5,2,6,1};
        int size= nums.length;
int tmp=0;
        System.out.println("Before Sorting");
        for(int num: nums){
            System.out.print(num+ " ");
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1;j++){
                if(nums[j] > nums[j+1]){
                    tmp= nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]= tmp;
                }
            }
        }

        System.out.println();

        System.out.println("After Sorting: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
