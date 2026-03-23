package module9;
public class SumOfDigits {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234; // change value as needed
        System.out.println("Sum of digits: " + sumDigits(n));
    }
}

