public class ReverseString {
    public static void main(String[] args) {
        String sentence = "Hello, what is your name?";
        String reverse = "";
        for (int i = sentence.length() - 1; i >= 0; i--){
            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);
    }
}
