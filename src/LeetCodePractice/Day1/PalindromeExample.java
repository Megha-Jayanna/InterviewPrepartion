package LeetCodePractice.Day1;

public class PalindromeExample {
        public boolean isPalindrome(String s) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                if(Character.isLetterOrDigit(s.charAt(i))) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            s = sb.toString();

            int left = 0, right = s.length() - 1;
            while(left < right) {
                if(s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

    public static void main(String[] args) {
        PalindromeExample p= new PalindromeExample();
        String s= "A man, a plan, a canal: Panama";
        System.out.println(p.isPalindrome(s));
        System.out.println(p.isPalindrome("hello"));
    }
}
