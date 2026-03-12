package basics.module8;
public class CountSetBits {
    public static void main(String[] args) {
        int num = 13;
        int count = 0;
        while(num > 0) {
            if((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        System.out.println("Number of set bits: " + count);
    }
}

