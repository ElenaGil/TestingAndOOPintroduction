package org.example;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "X5", "black", 2020);
        auto1.startAuto(auto1.getBrand(), auto1.getModel());
        auto1.setSpeed(60);
        System.out.println("Auto1 fährt mit Geschwindigkeit: " + auto1.getSpeed());

        Car auto2 = new Car("VW", "Golf", "silver", 2020);
        auto2.startAuto(auto2.getBrand(), auto2.getModel());
        auto2.setSpeed(60);
        System.out.println("Auto2 fährt mit Geschwindigkeit: " + auto2.getSpeed());
        auto2.setSpeed(80);
        System.out.println("Auto2 fährt mit Geschwindigkeit: " + auto2.getSpeed());

        Person tom = new Person("Tom", "Taylor", 99, "male");
        Person anna = new Person("Anna", "Schmidt", 27, "female");
        Person  peter = new Person("Peter", "Walter", 15, "male");

        System.out.println(tom.introducePerson());
        System.out.println(anna.introducePerson());
        System.out.println(peter.introducePerson());

        isPositive(7);
        isPositive(-4);
        multiply(4,7);
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int multiply(int a, int a2) {
        return a * a2;
    }

    public static Object getFirstLetter(String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        return text.charAt(0);
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / b;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        };
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static char getFirstCharacter(String text) {
        return text.charAt(0);
    }

    public  static String reverseString(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += input.charAt(input.length() - 1 - i);
        }
        return output;
    }

    public static boolean isPalindrome(String text) {
        if (reverseString(text).equalsIgnoreCase(text)) {
            return true;
        }
        return false;
    }

    public static int countVowels(String text) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (text.charAt(i) == vowels[j].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = i;
        }
        return result;
    }
}
