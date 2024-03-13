import java.util.Scanner;

class Faktorial {
    int nilai;

    public static long calculateFactorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public long faktorialBF(int n) {
        long startTime = System.nanoTime();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Waktu Eksekusi Brute Force: " + executionTime + " nanoseconds");
        return result;
    }

    public long faktorialDC(int n) {
        long startTime = System.nanoTime();
        if (n == 1) {
            return 1;
        } else {
            long result = n * faktorialDC(n - 1);
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Waktu Eksekusi Divide and Conquer: " + executionTime + " nanoseconds");
            return result;
        }
    }
}
