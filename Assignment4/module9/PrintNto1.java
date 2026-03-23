package module9;
public class PrintNto1 {
    public static void printNumbers(int n) {
        if (n == 0) {
            return; // base case
        }

        System.out.print(n + " ");
        printNumbers(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 5; // change value as needed
        printNumbers(n);
    }
}

