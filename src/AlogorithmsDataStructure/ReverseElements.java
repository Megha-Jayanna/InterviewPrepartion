package AlogorithmsDataStructure;

import java.util.Arrays;

//reverse the elements within an array
public class ReverseElements {
    public static void main(String[] args) {
        int[] a={4,3,2,1};

//        int start=0;
//        int end=a.length-1;
//        int i;
//        for(i=0;i<a.length;i++){
//            int tmp=a[i];
//            if(start < end){
//                tmp =a[start];
//                a[start]=a[end];
//                a[end]=tmp;
//                start++;
//                end--;
//            }
//        }
        int n=a.length;
        for (int i=0; i<n/2;i++){
            int tmp=a[i];
            a[i]= a[n-1-i];
            a[n-1-i]=tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
