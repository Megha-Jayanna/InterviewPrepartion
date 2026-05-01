package AlogorithmsDataStructure;

public class PalindromeExample {
    public static boolean isPali(String s){
        int a = s.length();
        for(int i=0; i<a/2;i++){
            if(s.charAt(i) != s.charAt(a-1-i)){
                return false;
            }
        }
        return true;
    }
    public boolean isSorted(String[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            if (a[i-1].compareTo(a[i]) > 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeExample p=new PalindromeExample();
        System.out.println(p.isPali("madamji"));
        System.out.println(p.isPali("madam"));
        String[] a = {"dog", "cat", "elephant"};
        System.out.println(p.isSorted(a));
        String[] a1 = {"cat", "elephant"};
        System.out.println(p.isSorted(a1));
    }
}
