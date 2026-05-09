package DSA;

public class SelectionSortExample {
    public static void main(String[] args) {

        int nums[] = {4,3,5,2,6,1};
        int size= nums.length;
        int tmp=0;
        int smallestIndex= -1;
        System.out.println("Before Sorting");
        for(int num: nums){
            System.out.print(num+ " ");
        }

        for(int i=0;i<size-1;i++){
            smallestIndex=i;
            for(int j=i+1; j< size;j++){
                if(nums[smallestIndex] > nums[j]){
                    smallestIndex=j;
                }
                tmp= nums[smallestIndex];
                nums[smallestIndex]= nums[i];
                nums[i]=tmp;
            }
        }


        System.out.println();

        System.out.println("After Sorting: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
