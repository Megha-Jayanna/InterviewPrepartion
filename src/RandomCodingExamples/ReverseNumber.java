package RandomCodingExamples;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=121;
        int rev =0;
        int tmp=n;
        System.out.println(n);
        while (n>0){
            int digits = n % 10;
            rev = rev * 10 + digits;
            n /= 10;
        }
        System.out.println(rev);

        if (tmp==rev){
            System.out.println("Palindrome");
        }else{

            System.out.println("Not Palindrome");
        }
    }
}
