package LeetCodePractice.Easy;

public class PalindromeCheck {
    public boolean palindromeCheck(int x){
        if(x<0){
            return false;
        }
        int r =0;
        int tmp=x;
        while(tmp>0){
            r= r* 10 + tmp %10;
            tmp /=10;
        }
        return r==x;
    }

    public static void main(String[] args) {
        PalindromeCheck p = new PalindromeCheck();
        int x= -121;
        System.out.println(p.palindromeCheck(x));
        int y=121;
        System.out.println(p.palindromeCheck(y));
        int z=10;
        System.out.println(p.palindromeCheck(z));
    }
}
