package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    // Level 1
    @Test
    public void isPositive_shouldReturnTrue_whenCalledWith7() {
        boolean result = Main.isPositive(7);
        Assertions.assertTrue(result);
    }

    @Test
    public void isPositive_shouldReturnFalse_whenCalledWithMinus4() {
        boolean result = Main.isPositive(-4);
        Assertions.assertFalse(result);
    }

    @Test
    public void multiply_shouldReturn28_whenCalledWith7and4() {
        int result = Main.multiply(7, 4);
        Assertions.assertEquals(28, result);
    }

    @Test
    public void multiply_shouldReturnMinus28_whenCalledWithMinus7and4() {
        int result = Main.multiply(-7, 4);
        Assertions.assertEquals(-28, result);
    }

    // Level 2

    @Test
    public void getFirstLetter_shouldReturnNull_whenCalledWithEmptyString() {
        Object actual = Main.getFirstLetter("");
        Assertions.assertNull(actual);
    }

    @Test
    public void getFirstLetter_shouldReturnNull_whenCalledWithNull() {
        Object actual = Main.getFirstLetter(null);
        Assertions.assertNull(actual);
    }

    @Test
    public void getFirstLetter_shouldReturnNotNull_whenCalledWithText() {
        Object actual = Main.getFirstLetter("Text");
        Assertions.assertEquals('T', actual);
    }

    @Test
    public void divide_shouldReturn2_whenCalledWith6and3() {
        double actual = Main.divide(6, 3);
        Assertions.assertEquals(2.0, actual);
    }

    @Test
    public void divide_shouldReturnException_whenCalledWith6and0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.divide(6, 0));
    }

    @Test
    public void isPrime_shouldReturnTrue_whenCalledWith7() {
        boolean result = Main.isPrime(7);
        Assertions.assertTrue(result);
    }

    @Test
    public void isPrime_shouldReturnFalse_whenCalledWith1() {
        boolean result = Main.isPrime(1);
        Assertions.assertFalse(result);
    }

    @Test
    public void isPrime_shouldReturnFalse_whenCalledWith110() {
        boolean result = Main.isPrime(110);
        Assertions.assertFalse(result);
    }

    @Test
    public void isPrime_shouldReturnTrue_whenCalledWith107() {
        boolean result = Main.isPrime(107);
        Assertions.assertTrue(result);
    }

    @Test
    public void isPrime_shouldReturnFalse_whenCalledWithMinus107() {
        boolean result = Main.isPrime(-107);
        Assertions.assertFalse(result);
    }

    // TDD
    // ====================================

// Level 1
    // sum()
    @Test
    public void sum_shouldReturn25_whenCalledWithMinus30and55() {
        int actual = Main.sum(-30, 55);
        Assertions.assertEquals(25, actual);
    }

    // isEven()
    @Test
    public void isEven_shouldReturnTrue_whenCalledWith8() {
        boolean actual = Main.isEven(8);
        Assertions.assertTrue(actual);
    }
    @Test
    public void isEven_shouldReturnFalse_whenCalledWith3() {
        boolean actual = Main.isEven(3);
        Assertions.assertFalse(actual);
    }

    // getFirstCharacter()
    @Test
    public void getFirstCharacter_shouldReturnH_whenCalledWithHello() {
        char actual = Main.getFirstCharacter("Hello");
        Assertions.assertEquals('H', actual);
    }

// Level 2
    @Test
    public void reverseString_shouldReturnAvaJ_whenCalledWithJavA() {
        String actual = Main.reverseString("JavA");
        Assertions.assertEquals("AvaJ", actual);
    }

    @Test
    public void isPalindrome_shouldReturnTrue_whenCalledWithOtto() {
        boolean actual = Main.isPalindrome("Otto");
        Assertions.assertTrue(actual);
    }

    @Test
    public void isPalindrome_shouldReturnFalse_whenCalledWithMotto() {
        boolean actual = Main.isPalindrome("Motto");
        Assertions.assertFalse(actual);
    }

    @Test
    public void countVowels_shouldReturn2_whenGivenHallo() {
        int actual = Main.countVowels("Hallo");
        Assertions.assertEquals(2, actual);
    }

// Level 3
    // Factorial
    @Test
    public void factorial_shouldReturn720_whenCAlledWith6() {
        int actual = Main.factorial(6);
        Assertions.assertEquals(720, actual);
    }

    @Test
    public void factorial_shouldReturn1_whenCAlledWith0() {
        int actual = Main.factorial(0);
        Assertions.assertEquals(100, actual);
    }

}