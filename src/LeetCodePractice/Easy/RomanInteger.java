package LeetCodePractice.Easy;

public class RomanInteger {
    public int romanToInt(String s) {
        int sum = 0;
        int[] val = new int[128];
        val['I'] = 1;
        val['V'] = 5;
        val['X'] = 10;
        val['L'] = 50;
        val['C'] = 100;
        val['D'] = 500;
        val['M'] = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && val[s.charAt(i)] < val[s.charAt(i + 1)]) {
                sum -= val[s.charAt(i)];
            } else {
                sum += val[s.charAt(i)];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanInteger r = new RomanInteger();
        String s = "III";
        System.out.println(r.romanToInt(s));
        String I1="MCMXCIV";
        System.out.println(r.romanToInt(I1));
    }
}