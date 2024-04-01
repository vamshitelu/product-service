package com.vsoft.util;

import java.util.Base64;

public class Base64Encode {
    public static void main(String[] args) {
        // String to encode
        String originalString = "";

        // Encode the string to Base64
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());

        // Print the encoded string
        System.out.println("Encoded String: " + encodedString);
    }
}