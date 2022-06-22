package com.codedifferently.assessment01.part01;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str) {
        int count = 0;
        int n = str.length();
        char ch[] = str.toCharArray();
        int restOfIndex = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
            if (ch[i] == ' ') {
                count++;
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                continue;
            } else {
                ch[restOfIndex++] = ch[i];
            }
        }
        return String.valueOf(ch, 0, n - count);
    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        if (str == null) {
            return null;
        }
        StringBuilder output = new StringBuilder(str).reverse();
        return output.toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){ return null; }

    public static String removeFirstAndLastCharacter(String str){
        str = str.substring(1, str.length()-1);
        return str;
    }
}
