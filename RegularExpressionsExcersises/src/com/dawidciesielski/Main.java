package com.dawidciesielski;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	        String s = "I want a bike";
        System.out.println(s.matches("I want a bike"));

        String regEx = "I want a \\w+.";
        String s2 = "I want a boat";
        System.out.println(s.matches(regEx));
        System.out.println(s2.matches(regEx));

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
        Matcher matcher2 = pattern.matcher(s2);
        System.out.println(matcher2.matches());

        String s3 = "Replace all blanks with underscore";
        System.out.println(s3.replaceAll("\\s", "_"));

        String s4 = "aaaabbbbcccdddeeefffggg";
        System.out.println(s4.matches("[a-g]+"));

        String s5 = "abcd.123";
        System.out.println(s5.matches("[a-d]*.*[1-3]"));

        String s6 = "abcd.123efgh.4ijkl.555";
        Pattern pattern6 = Pattern.compile("[a-l]+\\.(\\d+)");
        Matcher matcher6 = pattern6.matcher(s6);

        while (matcher6.find()) {
            System.out.println("Occurrence: " + matcher6.group(1));
        }

        String s7 = "{0,2} {4,6} {8,10}";
        //checking anything inside the {}
        Pattern pattern7 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher7 = pattern7.matcher(s7);
        while (matcher7.find()) {
            System.out.println("Occurrence: " + matcher7.group(1));
        }

        String s8 = "11111";
        //matches string with 5 digits
        System.out.println(s8.matches("^\\d{5}$"));

        String zipCode = "63-000";
        System.out.println(zipCode.matches("^\\d{2}-\\d{3}$"));
    }
}
