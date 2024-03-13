package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    public String method1(String fwdString) {

        if (fwdString == null) {
            return ""; // Return empty string
        }
        StringBuilder revString = new StringBuilder(fwdString); // Builds string to be reversed
        revString.reverse();
        return revString.toString().toUpperCase(); // Return reversed string in Uppercase

    }

    public String method2(String repeatString) {

        if (repeatString == null || repeatString.isEmpty()) {
            return "";
        }

        int repeatCount = repeatString.length(); // Number of times string is repeated (same as string length)
        String repeatedFirstChar = new String(new char[repeatCount]).replace("\0", String.valueOf(repeatString.charAt(0))); // Repeat first character of string same times as length of string
        return repeatedFirstChar + repeatString; // Return repeated first characters + rest of string
    }

    public String method3(String entireString) {

        if (entireString == null || entireString.isEmpty()) {
            return "";
        }

        String[] eachWord = entireString.split(" "); // Splice string by spaces
        StringBuilder reversedWords = new StringBuilder();

        for (int i = eachWord.length - 1; i >= 0; i--) {
            reversedWords.append(eachWord[i]); // Add each word to string in reverse order
            if (i > 0) {
                reversedWords.append(" "); // Add space between each word
            }
        }
        return reversedWords.toString(); // Return reversed words as a string
    }
}
