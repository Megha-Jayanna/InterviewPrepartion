package DSA;

public class LinearSearchExample {

    public boolean isPresent(int target) {

        int[] n = {5, 7, 9, 12, 17};
        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        LinearSearchExample s=new LinearSearchExample();

        System.out.println(s.isPresent(12));

    }
}
