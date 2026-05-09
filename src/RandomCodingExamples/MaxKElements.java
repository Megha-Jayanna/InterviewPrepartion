package RandomCodingExamples;

import java.util.Arrays;

public class MaxKElements {
    public static void main(String[] args) {
        int[] a= {-9,-12,1,4,3,5,6,8,19,20};
        int k=3;

        Arrays.sort(a);
        System.out.println("After Sorting");
        for(int i=0;i<a.length;i++) {

            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Elements");
        for(int i=a.length-k; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }
}
