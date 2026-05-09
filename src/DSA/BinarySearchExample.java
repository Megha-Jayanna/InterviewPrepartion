package DSA;

public class BinarySearchExample {

    public int isPresent(int target){
        int[] n = {5, 7, 9, 12, 17}; //Sorted Array hence no need to sort again



        int starting = 0;
        int ending = n.length -1;

        while (starting <= ending){
            int mid = (starting + ending) /2;
            for(int i=0; i<n.length;i++){
                if(n[mid] == target){
                    return mid;
                }else if(n[mid] <= target){
                    starting = mid +1;
                }else{
                    ending= mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchExample bp=new BinarySearchExample();
        System.out.println(bp.isPresent(5));
        System.out.println(bp.isPresent(100));
    }
}
