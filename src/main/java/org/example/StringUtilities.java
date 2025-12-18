package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    public static boolean shortString (String parameter) {
        if (parameter.length() < 5) {
            return true;
        }

        return false;
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter(String parameter) {
        return parameter.charAt(0);
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus(String parameter) {
        StringBuilder res = new StringBuilder();

        if(parameter.equals("asparagus")) {
            return "****";
        }

        if(parameter.contains("asparagus")) {
            String[] tempArray = parameter.split("asparagus");

            for(int i = 0; i < tempArray.length; i++) {
                res.append(tempArray[i]);
                if(i < tempArray.length - 1) {
                    res.append("****");
                }
            }
        }
        else {
            return parameter;
        }


        return res.toString();
    }

    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    public static String bigger(String first, String second) {

        if(first.length() == second.length() || first.length() > second.length()) {
            return first;
        }
        return second;

    }

}
