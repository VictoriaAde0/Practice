package org.practice;

public class Rstring {
    public static String rstring(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        if (string.length() == 1) {
            return string;
        }
        return rstring(string.substring(1)) + string.charAt(0);
    }
    public static void main(String[] args) {
        String string = "This problems were tasking and interesting at the same time";
        System.out.println(rstring(string));
    }
}
