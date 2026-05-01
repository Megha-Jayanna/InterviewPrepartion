package RandomCodingExamples;

public class CountVowels {
    public static void main(String[] args) {
        String s="Hello";
        s.toLowerCase();
        char[] ch= s.toCharArray();
        int count=0;
//        for (int i=0; i<ch.length;i++){
//            if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
//                count++;
//            }
//        }

        for (char c : ch) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
