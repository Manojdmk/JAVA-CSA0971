import java.util.ArrayList;
import java.util.Scanner;

class PerfectSquaresInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input lower and upper range
        System.out.print("Enter lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upper = scanner.nextInt();

        // Validate input range
        if (lower > upper) {
            System.out.println("Invalid range: Lower range should be less than or equal to upper range.");
            return;
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the range
        for (int i = lower; i <= upper; i++) {
            // Check if i is a perfect square
            if (isPerfectSquare(i)) {
                // Check if sum of digits is less than 10
                if (sumOfDigits(i) < 10) {
                    result.add(i);
                }
            }
        }

        // Print the result
        System.out.println(result);
    }

    // Function to check if a number is a perfect square
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Function to calculate sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}