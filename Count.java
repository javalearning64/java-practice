public class Count {
    public static void main(String[] args) {
        String sentence = "Happy birthday!\nBest wishes,\nMom and Dad";
        int lineCount = 0;
        int charCount = 0;
        int wordCount = 1;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.substring(i, i+1).equals("\n")) {
                lineCount++;
                wordCount++;
            } else if (!sentence.substring(i, i+1).equals(" ")){
                charCount++;
            } else {
                wordCount++;
            }
        }
        System.out.println(lineCount + "\n" + charCount + "\n" + wordCount);
    }
}
