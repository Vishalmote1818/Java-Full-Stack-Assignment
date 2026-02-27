package MethodImpl;

public class StringMethodsDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        // length()
        System.out.println("Length: " + s1.length());

        // charAt()
        System.out.println("Character at index 1: " + s1.charAt(1));

        // concat()
        System.out.println("Concat: " + s1.concat(" " + s2));

        // equals()
        System.out.println("Equals: " + s1.equals("Hello"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase("hello"));

        // toUpperCase()
        System.out.println("Uppercase: " + s1.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());

        // substring()
        System.out.println("Substring: " + s1.substring(1, 4));

        // contains()
        System.out.println("Contains 'ell': " + s1.contains("ell"));

        // replace()
        System.out.println("Replace l with x: " + s1.replace('l', 'x'));

        // indexOf()
        System.out.println("Index of 'l': " + s1.indexOf('l'));

        // trim()
        String s3 = "   Java   ";
        System.out.println("Trim: '" + s3.trim() + "'");
    }
}