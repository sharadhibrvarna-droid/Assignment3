package basics.module8;
public class CharFrequency {
    public static void main(String[] args) {
        String str = "program";
        int[] freq = new int[256];

        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for(int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)] != 0) {
                System.out.println(str.charAt(i) + " : " + freq[str.charAt(i)]);
                freq[str.charAt(i)] = 0;
            }
        }
    }
}

