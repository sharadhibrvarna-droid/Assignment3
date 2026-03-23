package module9;
public class PowerRecursion {
    public static int power(int a, int b) {
        if (b == 0) {
            return 1; // base case
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2, b = 5; // change values as needed
        System.out.println("Result: " + power(a, b));
    }
}
