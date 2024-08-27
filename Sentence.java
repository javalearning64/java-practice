public class Sentence {
    public static void main (String[] args){
        String sentence = "Hello world!";
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(Character.isLowerCase(sentence.charAt(i))){
               lowerCount++;
            } else if (Character.isUpperCase(sentence.charAt(i))){
                upperCount++;
            }
        }
        System.out.println("The number of uppercase characters: " + upperCount);
        System.out.println("The number of lowercase characters: " + lowerCount);
    }
}
