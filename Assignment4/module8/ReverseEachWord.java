package module8;
public class ReverseEachWord {
        public static void main(String[] args) {
            String sentence = "Hello world from Java";

            String[] words = sentence.split(" ");
            String result = "";

            for (String word : words) {
                String reversedWord = "";

                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord += word.charAt(i);
                }

                result += reversedWord + " ";
            }

            System.out.println(result.trim());
        }
    }
