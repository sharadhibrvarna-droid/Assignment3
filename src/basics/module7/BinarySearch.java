package basics.module7;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int low = 0, high = arr.length - 1, mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(low > high) {
            System.out.println("Element not found");
        }
    }
}

