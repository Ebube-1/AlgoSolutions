package com.ebube.mondayAlgorithms;

//A and T are complements of each other, as are C and G.
public class DNA {
    public static void main(String[] args) {
        System.out.println(dnaComplement("ATTGC"));   //TAACG
    }

    public static String dnaComplement(String dna) {

        String result = "";
        if(dna.isEmpty())  return "";
        for(String each : dna.split("")){
            if(each.equals("A")){
                result += "T";
            } else if (each.equals("C")){
                result +=  "G";
            } else if (each.equals("G")){
                result += "C";
            } else if (each.equals("T")){
                result += "A";
            }
        }
        return result;
    }


}
