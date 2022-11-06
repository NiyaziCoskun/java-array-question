public class CamelCase_Java {


    //Write a method that returns the format of the entered "String"
    // expression in accordance with the camelCase structure


    public static void main(String[] args) {

        //thisIsAGithubTest

        String expression = "This is a Github test";
        String neww = camelCase(expression);

        System.out.println(neww);


}
    public static String camelCase(String expression) {
        String newExpression = ""; //thisIsAGithubTest
        String [] words = expression.split(" ");

        boolean didYouLookAtTheFirstWord = false;

        for (String word : words) {
            if (!didYouLookAtTheFirstWord) {
                didYouLookAtTheFirstWord = true;
                newExpression += word.toLowerCase();
            }else {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String remainingLetters = word.substring(1, word.length()).toLowerCase();
                String newWord = firstLetter + remainingLetters;
                newExpression += newWord;
            }

        }


        return newExpression;
    }
}
