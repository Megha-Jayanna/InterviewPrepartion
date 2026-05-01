package AlogorithmsDataStructure;

import java.util.Arrays;

public class ElementWiseMultiplication {
    public static void main(String[] args) {
        int [] a= {1,2,3,4};
        int[] b= {2,2,1,1};
        int newArray[]=new int[a.length];
        for(int i=0;i<a.length;i++){
                newArray [i]=a[i]*b[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
