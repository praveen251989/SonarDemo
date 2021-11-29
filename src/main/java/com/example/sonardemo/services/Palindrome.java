package com.example.sonardemo.services;

public class Palindrome {
    public boolean isPalindrome(String str){

        if(str == null || str.length() == 0)
            return false;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
