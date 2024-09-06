[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/FpHRp_4F)
# String1

## Program Description:  
- Implement each method as described above
- Use the TestString1 file to check your work
- On submission github will auto grade your completed code
  - Each method is worth 2 points
  - Total of 34 points
- I recommend submitting when finished with each method just in case

## Statements Required: 
- See methods for requirements
package src.main.java;


public class String1
{
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *  helloName("Bob") → "Hello Bob!"
     *  helloName("Alice") → "Hello Alice!"
     *  helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        return unimplemented;
    }

    /*
     * Given two strings, a and b, return the result of putting them together in the order abba, 
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") → "HiByeByeHi"
     * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     * makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        return unimplemented;
    }

    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * makeTags("i", "Yay") → "<i>Yay</i>"
     * makeTags("i", "Hello") → "<i>Hello</i>"
     * makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {
        return unimplemented;
    }

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, 
     *      return a new string where the word is in the middle of the out string, 
     *      e.g. "<<word>>". 
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but 
     * not including index j.
     * makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     * makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        return unimplemented;
    }

    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") → "lololo"
     * extraEnd("ab") → "ababab"
     * extraEnd("Hi") → "HiHiHi"
     */
  public class ExtraEnd {

    public static void main(String[] args) {
        // Test cases
        System.out.println(extraEnd("Hello")); // Output: "lololo"
        System.out.println(extraEnd("ab"));    // Output: "ababab"
        System.out.println(extraEnd("Hi"));    // Output: "HiHiHi"
    }

    public static String extraEnd(String str) {
        // Get the last two characters of the string
        String lastTwoChars = str.substring(str.length() - 2);
        // Return three copies of the last two characters
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }
}


    /*
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
     * If the string is shorter than length 2, return whatever there is, 
     * so "X" yields "X", and the empty string "" yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * firstTwo("Hello") → "He"
     * firstTwo("abcdefg") → "ab"
     * firstTwo("ab") → "ab"
     */
    public String firstTwo(String str) {
          System.out.println(firstHalf("WooHoo"));      // Output: "Woo"
        System.out.println(firstHalf("HelloThere"));   // Output: "Hello"
        System.out.println(firstHalf("abcdef"));       // Output: "abc"
        System.out.println(firstHalf("123456"));       // Output: "123"
    }

    public static String firstHalf(String str) {
        // Find the index to split the string in half
        int halfLength = str.length() / 2; 
        // Return the first half of the string
        return str.substring(0, halfLength);
    }
     

    }

    /*
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".]
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     */
    public String firstHalf(String str) {
   System.out.println(withoutEnd("Hello"));      // Output: "ell"
        System.out.println(withoutEnd("java"));       // Output: "av"
        System.out.println(withoutEnd("coding"));     // Output: "odin"
        System.out.println(withoutEnd("ab"));         // Output: "" (empty string)
        System.out.println(withoutEnd("xyz"));        // Output: "y"
    }

    public static String withoutEnd(String str) {
        // Return the substring without the first and last character
        return str.substring(1, str.length() - 1);
    }

    }

    /*
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
     * The string length will be at least 2.
     * withoutEnd("Hello") → "ell"
     * withoutEnd("java") → "av"
     * withoutEnd("coding") → "odin"
     */
    public String withoutEnd(String str) {
  System.out.println(comboString("hi", "Hello"));    // Output: "hiHellohi"
        System.out.println(comboString("Hello", "hi"));    // Output: "hiHellohi"
        System.out.println(comboString("aaa", "b"));        // Output: "baaab"
        System.out.println(comboString("", "Hello"));        // Output: "Hello"
        System.out.println(comboString("abc", ""));          // Output: "abc"
    }

    public static String comboString(String a, String b) {
        // Determine which string is shorter
        if (a.length() < b.length()) {
            return a + b + a;  // short + long + short
        } else {
            return b + a + b;  // short + long + short
        }
    }

    }

    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with the 
     * shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     */
    public String comboString(String a, String b) {
   System.out.println(middleThree("Candy"));         // Output: "and"
        System.out.println(middleThree("and"));           // Output: "and"
        System.out.println(middleThree("solving"));       // Output: "lvi"
        System.out.println(middleThree("abcde"));         // Output: "cde"
        System.out.println(middleThree("racecar"));       // Output: "cec"
    }

    public static String middleThree(String str) {
        // Find the start index for the middle three characters
        int midIndex = str.length() / 2;  // Integer division automatically floors
        return str.substring(midIndex - 1, midIndex + 2);  // Extract 3 characters
    }

    }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
     * The string length will be at least 3.
     * middleThree("Candy") → "and"
     * middleThree("and") → "and"
     * middleThree("solving") → "lvi"
     */
    public String middleThree(String str) {
        System.out.println(extraFront("Hello"));  // Output: "HeHeHe"
        System.out.println(extraFront("ab"));      // Output: "ababab"
        System.out.println(extraFront("H"));       // Output: "HHH"
        System.out.println(extraFront(""));        // Output: ""
        System.out.println(extraFront("A"));       // Output: "AAA"
    }

    public static String extraFront(String str) {
        // Get the first two characters or the entire string if it's less than 2 characters
        String front; 
        if (str.length() < 2) {
            front = str;  // Use what is there
        } else {
            front = str.substring(0, 2);  // Get the first two characters
        }
        
        // Create the new string with 3 copies of the front
        return front + front + front;  // Concatenate the front three times
    }

    }

    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     * extraFront("Hello") → "HeHeHe"
     * extraFront("ab") → "ababab"
     * extraFront("H") → "HHH"
     */
    public String extraFront(String str) {
 System.out.println(left2("Hello"));  // Output: "lloHe"
        System.out.println(left2("java"));   // Output: "vaja"
        System.out.println(left2("Hi"));     // Output: "Hi"
        System.out.println(left2("abcdef"));  // Output: "cdefab"
        System.out.println(left2("xy"));     // Output: "xy"
    }

    public static String left2(String str) {
        // Get the first two characters
        String firstTwo = str.substring(0, 2);
        // Get the rest of the string after the first two characters
        String restOfString = str.substring(2);
        // Concatenate the rest of the string with the first two characters at the end
        return restOfString + firstTwo;
    }

    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * hasBad("badxx") → true
     * hasBad("xbadxx") → true
     * hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) {
 
        System.out.println(hasBad("badxx"));    // Output: true
        System.out.println(hasBad("xbadxx"));   // Output: true
        System.out.println(hasBad("xxbadxx"));  // Output: false
        System.out.println(hasBad(""));          // Output: false
        System.out.println(hasBad("b"));         // Output: false
        System.out.println(hasBad("ba"));        // Output: false
        System.out.println(hasBad("bad"));       // Output: true
    }

    public static boolean hasBad(String str) {
        // Check for "bad" at index 0 or 1
        if (str.length() >= 3) {
            // Check if "bad" begins at index 0
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
        }
        if (str.length() >= 4) {
            // Check if "bad" begins at index 1
            if (str.substring(1, 4).equals("bad")) {
                return true;
            }
        }
        // If neither condition is met, return false
        return false;
    }

    }

    /*
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the concatenation creates a double-char, then omit one of the chars, 
     * 	so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     */
    public String conCat(String a, String b) {

        System.out.println(conCat("abc", "cat"));   // Output: "abcat"
        System.out.println(conCat("dog", "cat"));   // Output: "dogcat"
        System.out.println(conCat("abc", ""));      // Output: "abc"
        System.out.println(conCat("Hello", "lo"));  // Output: "Hello"
        System.out.println(conCat("", "world"));     // Output: "world"
        System.out.println(conCat("hi", "i"));       // Output: "hi"
    }

    public static String conCat(String a, String b) {
        // If either string is empty, return the other string
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }

        // Check if the last character of 'a' and the first character of 'b' are the same
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            // Concatenate without the first character of 'b' (as it's a duplicate)
            return a + b.substring(1);
        }

        // Otherwise, concatenate normally
        return a + b;
    }
    }

    /*
     *Given two strings, append them together (known as "concatenation") and return the result. 
     *However, if the strings are different lengths, omit chars from the longer string 
     *	so it is the same length as the shorter string. 
     *So "Hello" and "Hi" yield "loHi". 
     *The strings may be any length.
     *minCat("Hello", "Hi") → "loHi"
     *minCat("Hello", "java") → "ellojava"
     *minCat("java", "Hello") → "javaello"
     */
    public String minCat(String a, String b) {

        System.out.println(minCat("Hello", "Hi"));       // Output: "loHi"
        System.out.println(minCat("Hello", "java"));     // Output: "ellojava"
        System.out.println(minCat("java", "Hello"));     // Output: "javaello"
        System.out.println(minCat("abc", "xyz"));        // Output: "abcxyz"
        System.out.println(minCat("", "world"));          // Output: "world"
        System.out.println(minCat("onlyone", ""));       // Output: "onlyone"
        System.out.println(minCat("short", "longer"));    // Output: "short"
    }

    public static String minCat(String a, String b) {
        // Determine the lengths of both strings
        int lenA = a.length();
        int lenB = b.length();

        // Calculate the length to be used for concatenation
        if (lenA > lenB) {
            a = a.substring(lenA - lenB); // Trim `a` to the length of `b`
        } else if (lenB > lenA) {
            b = b.substring(lenB - lenA); // Trim `b` to the length of `a`
        }

        // Concatenate the two strings
        return a + b;
    }
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
     * and otherwise return the string unchanged.
     * withoutX("xHix") → "Hi"
     * withoutX("xHi") → "Hi"
     * withoutX("Hxix") → "Hxi"
     */
    public String withoutX(String str) {
        System.out.println(withoutX("xHix"));  // Output: "Hi"
        System.out.println(withoutX("xHi"));   // Output: "Hi"
        System.out.println(withoutX("Hxix"));  // Output: "Hxi"
        System.out.println(withoutX("Hello")); // Output: "Hello"
        System.out.println(withoutX("x"));     // Output: ""
        System.out.println(withoutX(""));      // Output: ""
        System.out.println(withoutX("xxHi"));  // Output: "Hi"
        System.out.println(withoutX("HiXX"));  // Output: "HiX"
    }

    public static String withoutX(String str) {
        // Check the first character
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1); // Remove the first character if it's 'x'
        }
        // Check the last character
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); // Remove the last character if it's 'x'
        }
        return str; // Return the modified or original string
    }
    }

    /*
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
     * The string may be any length. 
     * Harder than it looks.
     * deFront("Hello") → "llo"
     * deFront("java") → "va"
     * deFront("away") → "aay"
     */
    public String deFront(String str) {    
    System.out.println(deFront("Hello")); // Output: "llo"
        System.out.println(deFront("java"));  // Output: "va"
        System.out.println(deFront("away"));  // Output: "aay"
        System.out.println(deFront("abc"));   // Output: "c"
        System.out.println(deFront("ab"));    // Output: "ab"
        System.out.println(deFront("b"));     // Output: "b"
        System.out.println(deFront("a"));     // Output: "a"
        System.out.println(deFront(""));      // Output: ""
    }

    public static String deFront(String str) {
        // Initialize the result string
        String result = "";

        // Check the first character and add it if it's 'a'
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += 'a'; // Keep the first character
        }

        // Check the second character and add it if it's 'b'
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += 'b'; // Keep the second character
        }

        // Append the rest of the string from the 3rd character onwards
        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result; // Return the final modified string
    }
    }

}



## Sample Output:
- See methods for samples
