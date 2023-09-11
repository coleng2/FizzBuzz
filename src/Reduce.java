public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;

        // print number of steps to make n = 0
        //   - if n is even: divide n by 2
        //   - if n is odd: subtract 1 from n
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }

            steps++;
        }

        System.out.println(steps);
    }
}
