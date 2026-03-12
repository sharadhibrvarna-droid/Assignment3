package basics.module9;
public class Subsets {
    static void printSubsets(int[] arr, int index, String current) {
        if(index == arr.length) {
            System.out.println(current);
            return;
        }
        printSubsets(arr, index + 1, current + arr[index] + " ");
        printSubsets(arr, index + 1, current);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubsets(arr, 0, "");
    }
}
