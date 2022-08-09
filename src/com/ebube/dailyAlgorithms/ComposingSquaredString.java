package com.ebube.dailyAlgorithms;

public class ComposingSquaredString {

    public static void main(String[] args) {

        String studentNames = "Darli\nEbube\nIsiom\nChiso\nLovee";
        String studentName = "Darli\nEbube\nIsiom\nChiso\nLovee";
//        System.out.println(studentNames);

        System.out.println(compose1("byGt\nhTts\nRTFF\nCnnI", "jIRl\nViBu\nrWOb\nNkTB"));
        //bNkTB
        //hTrWO
        //RTFVi
        //CnnIj

    }

    public static String compose1(String s1, String s2) {
        String[] a = s1.split("\n");
        String[] b = s2.split("\n");

        int length= a.length;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++){
            String wordA = a[i].substring(0, i+1);
            String wordB = b[length - 1 - i].substring(0, length-i);

                    sb.append(wordA+wordB);
                    sb.append("\n");

        }

        return sb.toString().trim();
    }


}
