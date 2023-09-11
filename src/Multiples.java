public class Multiples {
    public static void main(String[] args) {
        int cnt = 0;

        // count the number that is 3 and 5's multiples
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
