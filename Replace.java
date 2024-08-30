public class Replace {
    public static void main(String[] args) {
        String sentence = "My favorite cake is apple cake, I do not like lemon cake.";
        String newSentence = "";
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ','){
                 newSentence += ";";
            } else {
                newSentence += sentence.substring(i, i+1);
            }
        }
        System.out.println(newSentence);
    }
}
