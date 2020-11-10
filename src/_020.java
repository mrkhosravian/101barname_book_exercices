public class _020 {
    public static void main(String[] args) {
        new _020().solve();
    }

    private void solve() {
        int x = 1, y = 1;
        _017 isPrimeSolver = new _017();
        while (y < 1e8 || !isPrimeSolver.solve(y)) {
            int t = x;
            x = y;
            y += t;
        }
        System.out.println(y);
    }

    private void bookAproach() {
        long a = 0, b = 1, c = 0;
        long biggest = 0;
        while (true) {
            c = a + b;
            a = b;
            b = c;
            boolean isPrime = true;
            if (c / 1000000000 > 0)
                break;
            for (long i = 2; i < Math.sqrt(c); i++) {
                if (c % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                biggest = c;
            }
        }

        System.out.println(biggest);
    }
}
