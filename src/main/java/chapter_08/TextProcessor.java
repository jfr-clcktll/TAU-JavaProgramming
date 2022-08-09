package chapter_08;



public class TextProcessor {

    public static void main(String[] args) {
        countWords("This is word count test");
        reverseString("This statement has been printed in reverse");
        makeString("Let'sSeeIfANewStringCanBeConstructed");

    }

    /*
    Write a method that counts the number of words in a String
    and prints them individually on a new line.
     */

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);

        }
    }

    /*
    Write a method  that prints a given string backwards.
    For example if camel, it prints lemac.
     */

    public static void reverseString(String text) {
        for(int i= text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
            }
        System.out.println();
        }

    /*
    Write a method that adds spaces to a String where all words
    are written together with no spaces. Each new word begins with
    a capital letter.
     */

    public static void makeString(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for(int i=0; i<modifiedText.length(); i++){
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }

    }

