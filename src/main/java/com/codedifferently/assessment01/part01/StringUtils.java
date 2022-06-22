package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        String sentenceArray [] = sentence.split(" "); // split the sentence
        for (int i = 0; i < sentenceArray.length; i++) { //loop through sentence length
        }
        return sentenceArray;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        int index = sentence.indexOf(' ');
        if (index > -1) { //check if more than one word
            return sentence.substring(0, index).trim();
        }
        else {
            return sentence; //sentence is the first word
        }
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        return null;
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){return null;}

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){return null;}
}
