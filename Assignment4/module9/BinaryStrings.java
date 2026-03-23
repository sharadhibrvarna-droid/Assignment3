package module9;
public class BinaryStrings {
    public static void generate(String current, int n) {
        // Base case
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        // Add '0'
        generate(current + "0", n);

        // Add '1'
        generate(current + "1", n);
    }

    public static void main(String[] args) {
        int n = 3; // change value as needed
        generate("", n);
    }
}
