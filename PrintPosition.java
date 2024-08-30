public class PrintPosition {
    public static void main(String[] args) {
        String sentence = "Hi! Nice to meet you \n How are you doing today? \n :)";
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.substring(i, i + 1).equals("\n")){
                System.out.println(i+1);
                System.out.println(sentence.charAt(i+2));
            }
        }
    }
}
