package com.ebube.mondayAlgorithms;

//For [24, 85, 0] the output should be 21784
//
//[24,       85,       0       ] - The initial array
//[00011000, 01010101, 00000000] - Translate each number to Binary
//   000000000101010100011000    - Compact to a single number
//            21784              - Translate to Decimal


import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.*;

public class Binary {
    //main method to perform the array-packing operation
    public static int arrayPacking(List<Integer> integer) {
        String bit = "";
        // convert each of the list item to binary and join
        for (int i = 0; i <= integer.size() - 1; i++) {
            bit = bit + convertToBinary(integer.get(i));
        }
        //convert the concatenated binaries back to decimal
        return convertToDecimal(bit);
    }

    //sub-method to convert from decimal to binary
    public static String convertToBinary(int decimal) {
        String[] bits = {"0", "0", "0", "0", "0", "0", "0", "0"};
        int i = 0;
        while (decimal > 0) {
            bits[i] = Integer.toString(decimal % 2);
            decimal = decimal / 2;
            i++;
        }
        return String.join("", bits);
    }

    //sub-method to convert from binary to decimal
    public static int convertToDecimal(String binary) {
        int decimal = 0;
        String[] bitArray = binary.split("");
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal + Integer.parseInt(bitArray[i]) * (int) Math.pow(2, i);
        }
        return decimal;
    }
    }


