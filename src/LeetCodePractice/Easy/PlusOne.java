package LeetCodePractice.Easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] results= new int[n+1];
        results[0]=1;
        return results;
    }

    public static void main(String[] args) {
        PlusOne p=new PlusOne();
        int[] digits={8,9};
        System.out.println(Arrays.toString(p.plusOne(digits)));

    }
}
