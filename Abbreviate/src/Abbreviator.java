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

        String abvWord = "";
        String[] words = string.split("[^\\w]+");

        //System.out.println(words[4]);

        for (int x = 0; x < words.length; x++) {
            //for (String word : words) {
                if (words[x].length() > 3) {

                    int WordLength = words[x].length();
                    //System.out.println(WordLength);
                    int MiddleValue = WordLength - 2;
                    //System.out.println(MiddleValue);

                    char firstLetter = words[x].charAt(0);
                    //System.out.println(firstLetter);
                    char lastLetter = words[x].charAt(words[x].length() - 1);
                    //System.out.println(lastLetter);
//                    abvWord = "" + firstLetter + MiddleValue + lastLetter;
                  //  System.out.println(abvWord);
                abvWord = abvWord.concat(" " + firstLetter + MiddleValue + lastLetter);
                }
                else abvWord = abvWord.concat(" " + words[x]);
            }
        return abvWord;
    }

        public static void main (String[]args){

            Abbreviator abv = new Abbreviator();

            System.out.println(abv.abbreviate("This is the greatest thing the world has ever experienced since elephants, collosal fhjdshfjdshj"));
            System.out.println(abv.abbreviate((" You\n" +
                    " Youn3,\n" +
                    " Youn3,n2d not\n" +
                    " Youn3,n2d notw3, to\n" +
                    " Youn3,n2d notw3, toc6e\n" +
                    " Youn3,n2d notw3, toc6et2s\n" +
                    " Youn3,n2d notw3, toc6et2sc7s")));
        }
}
