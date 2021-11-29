package com.example.sonardemo;


import com.example.sonardemo.services.Palindrome;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class SonarDemoApplicationTests {

    @Test
    void isPalindromeTest() {
        //assertFalse();
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("radar"));
        assertFalse(palindrome.isPalindrome("demo"));
        assertFalse(palindrome.isPalindrome(""));
        assertFalse(palindrome.isPalindrome(null));

    }

}
