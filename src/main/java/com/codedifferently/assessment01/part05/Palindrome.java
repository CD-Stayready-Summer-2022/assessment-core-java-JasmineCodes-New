package com.codedifferently.assessment01.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length()-1; j >= i; j--) {
                if (input.charAt(i) == input.charAt(j)) {
                        count++;
                }
            }
        }
        return count;
    }
}
