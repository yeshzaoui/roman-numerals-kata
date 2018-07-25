package com.olbati;

import com.google.common.base.Preconditions;

import java.util.Map;
import java.util.TreeMap;


public class RomanNumerals {

    private static final TreeMap<Integer, String> ROMAN_CHARACTERS = new TreeMap<>();
    private static final TreeMap<String, Integer> ROMAN_COMPLEXE_CHARACTERS = new TreeMap<>();

    static {
        ROMAN_CHARACTERS.put(1, "I");
        ROMAN_CHARACTERS.put(4, "IV");
        ROMAN_CHARACTERS.put(5, "V");
        ROMAN_CHARACTERS.put(9, "IX");
        ROMAN_CHARACTERS.put(10, "X");
        ROMAN_CHARACTERS.put(40, "XL");
        ROMAN_CHARACTERS.put(50, "L");
        ROMAN_CHARACTERS.put(90, "XC");
        ROMAN_CHARACTERS.put(100, "C");
        ROMAN_CHARACTERS.put(400, "CD");
        ROMAN_CHARACTERS.put(500, "D");
        ROMAN_CHARACTERS.put(900, "CM");
        ROMAN_CHARACTERS.put(1000, "M");

        ROMAN_COMPLEXE_CHARACTERS.put("IV", 4);
        ROMAN_COMPLEXE_CHARACTERS.put("IX", 9);
        ROMAN_COMPLEXE_CHARACTERS.put("XL", 40);
        ROMAN_COMPLEXE_CHARACTERS.put("XC", 90);
        ROMAN_COMPLEXE_CHARACTERS.put("CD", 400);
        ROMAN_COMPLEXE_CHARACTERS.put("CM", 900);
    }

    public String parseToRoman(int input) {

        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 3000);

        int key = ROMAN_CHARACTERS.floorKey(input);
        if (input == key) {
            return ROMAN_CHARACTERS.get(input);
        }
        return ROMAN_CHARACTERS.get(key) + parseToRoman(input - key);
    }

    public int parseToNumber(String romanNumber) {
        if (romanNumber.length() == 0) {
            return 0;
        }
        int result = 0;
        if (romanNumber.length() >= 2) {
            for (Map.Entry<String, Integer> entry : ROMAN_COMPLEXE_CHARACTERS.entrySet()) {
                if (romanNumber.contains(entry.getKey())) {
                    result += entry.getValue();
                    romanNumber = romanNumber.replace(entry.getKey(), "");
                }
            }
        }
        for (Map.Entry<Integer, String> entry : ROMAN_CHARACTERS.entrySet()) {
            for (int i = 0; i < romanNumber.length(); i++) {
                if (entry.getValue().equals(String.valueOf(romanNumber.charAt(i)))) {
                    result += entry.getKey();
                }
            }
            romanNumber = romanNumber.replaceAll(entry.getValue(), "");
        }
        return result;
    }
}
