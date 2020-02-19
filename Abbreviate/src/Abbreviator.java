/*
The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.

Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or greater into an abbreviation, following these rules:

A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
 */


import java.util.ArrayList;

public class Abbreviator {
    public String abbreviate(String string) {
        // ...

        String[] words = string.split(" ");

        System.out.println(words[4]);

/*        for (int x = 0; x < words.length; x++){

 //       System.out.println(words[x]);
        }*/


        for (String word: words) {
            if (word.length() > 3) {

                int WordLength = word.length();
                int MiddleValue = WordLength - 2;

                char firstLetter = word.charAt(0);
                char lastLetter = word.charAt(word.length() - 1);

                String abvWord = "" + firstLetter + MiddleValue + lastLetter;
                System.out.println(abvWord);

                return abvWord;
            }
            else return word;
        }


        return null;
    }

    public static void main(String[] args) {

        Abbreviator abv = new Abbreviator();

        abv.abbreviate("This is the greatest thing the world has ever experienced since elephants, collosal fhjdshfjdshj");

    }


}
