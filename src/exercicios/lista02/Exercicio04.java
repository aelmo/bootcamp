package exercicios.lista02;

import java.util.ArrayList;

public class Exercicio04 {
    /* Needs to be fixed
    public static void radixSort(int iArr[]) {
        String[] strArray = new String[iArr.length];

        ArrayList<String> strArray1 = new ArrayList<String>();
        ArrayList<String> strArray2= new ArrayList<String>();
        ArrayList<String> strArray3 = new ArrayList<String>();
        ArrayList<String>strArray4 = new ArrayList<String>();
        ArrayList<String>strArray5 = new ArrayList<String>();
        ArrayList<String>strArray6 = new ArrayList<String>();
        ArrayList<String>strArray7 = new ArrayList<String>();
        ArrayList<String>strArray8 = new ArrayList<String>();
        ArrayList<String>strArray9= new ArrayList<String>();
        ArrayList<String>strArray0 = new ArrayList<String>();

        for (int i = 0; i < iArr.length; i++) {
            strArray[i] = String.format("%05d", iArr[i]);
            switch(getNLastChar(strArray[i], 1)) {
                case "1" -> strArray1.add(strArray[i]);
                case "2" -> strArray2.add(strArray[i]);
                case "3" -> strArray3.add(strArray[i]);
                case "4" -> strArray4.add(strArray[i]);
                case "5" -> strArray5.add(strArray[i]);
                case "6" -> strArray6.add(strArray[i]);
                case "7" -> strArray7.add(strArray[i]);
                case "8" -> strArray8.add(strArray[i]);
                case "9" -> strArray9.add(strArray[i]);
                case "0" -> strArray0.add(strArray[i]);
            }
        }

        //5
        ArrayList<String>strArrayAll = new ArrayList<String>();

        strArrayAll.addAll(strArray0);
        strArrayAll.addAll(strArray1);
        strArrayAll.addAll(strArray2);
        strArrayAll.addAll(strArray3);
        strArrayAll.addAll(strArray4);
        strArrayAll.addAll(strArray5);
        strArrayAll.addAll(strArray6);
        strArrayAll.addAll(strArray7);
        strArrayAll.addAll(strArray8);
        strArrayAll.addAll(strArray9);
        System.out.println(strArrayAll);
        //6
        strArray0 = new ArrayList<String>();
        strArray1 = new ArrayList<String>();
        strArray2 = new ArrayList<String>();
        strArray3 = new ArrayList<String>();
        strArray4 = new ArrayList<String>();
        strArray5 = new ArrayList<String>();
        strArray6= new ArrayList<String>();
        strArray7 = new ArrayList<String>();
        strArray8 = new ArrayList<String>();
        strArray9 = new ArrayList<String>();


        for (int i = 0; i < iArr.length; i++) {

            switch(getNLastChar(strArrayAll.get(i), 2)) {
                case "1" -> strArray1.add(strArrayAll.get(i));
                case "2" -> strArray2.add(strArrayAll.get(i));
                case "3" -> strArray3.add(strArrayAll.get(i));
                case "4" -> strArray4.add(strArrayAll.get(i));
                case "5" -> strArray5.add(strArrayAll.get(i));
                case "6" -> strArray6.add(strArrayAll.get(i));
                case "7" -> strArray7.add(strArrayAll.get(i));
                case "8" -> strArray8.add(strArrayAll.get(i));
                case "9" -> strArray9.add(strArrayAll.get(i));
                case "0" -> strArray0.add(strArrayAll.get(i));
            }
        }

        ArrayList<String>strArrayAll2 = new ArrayList<String>();

        strArrayAll2.addAll(strArray0);
        strArrayAll2.addAll(strArray1);
        strArrayAll2.addAll(strArray2);
        strArrayAll2.addAll(strArray3);
        strArrayAll2.addAll(strArray4);
        strArrayAll2.addAll(strArray5);
        strArrayAll2.addAll(strArray6);
        strArrayAll2.addAll(strArray7);
        strArrayAll2.addAll(strArray8);
        strArrayAll2.addAll(strArray9);
        System.out.println(strArrayAll2);

        strArray0 = new ArrayList<String>();
        strArray1 = new ArrayList<String>();
        strArray2 = new ArrayList<String>();
        strArray3 = new ArrayList<String>();
        strArray4 = new ArrayList<String>();
        strArray5 = new ArrayList<String>();
        strArray6= new ArrayList<String>();
        strArray7 = new ArrayList<String>();
        strArray8 = new ArrayList<String>();
        strArray9 = new ArrayList<String>();
        //63
        for (int i = 0; i < iArr.length; i++) {

            switch(getNLastChar(strArrayAll2.get(i), 3)) {
                case "1" -> strArray1.add(strArrayAll2.get(i));
                case "2" -> strArray2.add(strArrayAll2.get(i));
                case "3" -> strArray3.add(strArrayAll2.get(i));
                case "4" -> strArray4.add(strArrayAll2.get(i));
                case "5" -> strArray5.add(strArrayAll2.get(i));
                case "6" -> strArray6.add(strArrayAll2.get(i));
                case "7" -> strArray7.add(strArrayAll2.get(i));
                case "8" -> strArray8.add(strArrayAll2.get(i));
                case "9" -> strArray9.add(strArrayAll2.get(i));
                case "0" -> strArray0.add(strArrayAll2.get(i));
            }
        }

        ArrayList<String>strArrayAll3 = new ArrayList<String>();

        strArrayAll3.addAll(strArray0);
        strArrayAll3.addAll(strArray1);
        strArrayAll3.addAll(strArray2);
        strArrayAll3.addAll(strArray3);
        strArrayAll3.addAll(strArray4);
        strArrayAll3.addAll(strArray5);
        strArrayAll3.addAll(strArray6);
        strArrayAll3.addAll(strArray7);
        strArrayAll3.addAll(strArray8);
        strArrayAll3.addAll(strArray9);
        System.out.println(strArrayAll3);

        strArray0 = new ArrayList<String>();
        strArray1 = new ArrayList<String>();
        strArray2 = new ArrayList<String>();
        strArray3 = new ArrayList<String>();
        strArray4 = new ArrayList<String>();
        strArray5 = new ArrayList<String>();
        strArray6= new ArrayList<String>();
        strArray7 = new ArrayList<String>();
        strArray8 = new ArrayList<String>();
        strArray9 = new ArrayList<String>();
        //64

        for (int i = 0; i < iArr.length; i++) {

            switch(getNLastChar(strArrayAll3.get(i), 3)) {
                case "1" -> strArray1.add(strArrayAll3.get(i));
                case "2" -> strArray2.add(strArrayAll3.get(i));
                case "3" -> strArray3.add(strArrayAll3.get(i));
                case "4" -> strArray4.add(strArrayAll3.get(i));
                case "5" -> strArray5.add(strArrayAll3.get(i));
                case "6" -> strArray6.add(strArrayAll3.get(i));
                case "7" -> strArray7.add(strArrayAll3.get(i));
                case "8" -> strArray8.add(strArrayAll3.get(i));
                case "9" -> strArray9.add(strArrayAll3.get(i));
                case "0" -> strArray0.add(strArrayAll3.get(i));
            }
        }

        ArrayList<String>strArrayAll4 = new ArrayList<String>();

        strArrayAll4.addAll(strArray0);
        strArrayAll4.addAll(strArray1);
        strArrayAll4.addAll(strArray2);
        strArrayAll4.addAll(strArray3);
        strArrayAll4.addAll(strArray4);
        strArrayAll4.addAll(strArray5);
        strArrayAll4.addAll(strArray6);
        strArrayAll4.addAll(strArray7);
        strArrayAll4.addAll(strArray8);
        strArrayAll4.addAll(strArray9);
        System.out.println(strArrayAll4);

        strArray0 = new ArrayList<String>();
        strArray1 = new ArrayList<String>();
        strArray2 = new ArrayList<String>();
        strArray3 = new ArrayList<String>();
        strArray4 = new ArrayList<String>();
        strArray5 = new ArrayList<String>();
        strArray6= new ArrayList<String>();
        strArray7 = new ArrayList<String>();
        strArray8 = new ArrayList<String>();
        strArray9 = new ArrayList<String>();

        //

        for (int i = 0; i < iArr.length; i++) {

            switch(getNLastChar(strArrayAll4.get(i), 4)) {
                case "1" -> strArray1.add(strArrayAll4.get(i));
                case "2" -> strArray2.add(strArrayAll4.get(i));
                case "3" -> strArray3.add(strArrayAll4.get(i));
                case "4" -> strArray4.add(strArrayAll4.get(i));
                case "5" -> strArray5.add(strArrayAll4.get(i));
                case "6" -> strArray6.add(strArrayAll4.get(i));
                case "7" -> strArray7.add(strArrayAll4.get(i));
                case "8" -> strArray8.add(strArrayAll4.get(i));
                case "9" -> strArray9.add(strArrayAll4.get(i));
                case "0" -> strArray0.add(strArrayAll4.get(i));
            }
        }

        ArrayList<String>strArrayAll5 = new ArrayList<String>();

        strArrayAll5.addAll(strArray0);
        strArrayAll5.addAll(strArray1);
        strArrayAll5.addAll(strArray2);
        strArrayAll5.addAll(strArray3);
        strArrayAll5.addAll(strArray4);
        strArrayAll5.addAll(strArray5);
        strArrayAll5.addAll(strArray6);
        strArrayAll5.addAll(strArray7);
        strArrayAll5.addAll(strArray8);
        strArrayAll5.addAll(strArray9);
        System.out.println(strArrayAll5);

        strArray0 = new ArrayList<String>();
        strArray1 = new ArrayList<String>();
        strArray2 = new ArrayList<String>();
        strArray3 = new ArrayList<String>();
        strArray4 = new ArrayList<String>();
        strArray5 = new ArrayList<String>();
        strArray6= new ArrayList<String>();
        strArray7 = new ArrayList<String>();
        strArray8 = new ArrayList<String>();
        strArray9 = new ArrayList<String>();

        //

        for (int i = 0; i < iArr.length; i++) {
            switch(getNLastChar(strArrayAll5.get(i), 5)) {
                case "1" -> strArray1.add(strArrayAll5.get(i));
                case "2" -> strArray2.add(strArrayAll5.get(i));
                case "3" -> strArray3.add(strArrayAll5.get(i));
                case "4" -> strArray4.add(strArrayAll5.get(i));
                case "5" -> strArray5.add(strArrayAll5.get(i));
                case "6" -> strArray6.add(strArrayAll5.get(i));
                case "7" -> strArray7.add(strArrayAll5.get(i));
                case "8" -> strArray8.add(strArrayAll5.get(i));
                case "9" -> strArray9.add(strArrayAll5.get(i));
                case "0" -> strArray0.add(strArrayAll5.get(i));
            }
        }

        ArrayList<String>strArrayAll6 = new ArrayList<String>();

        strArrayAll6.addAll(strArray0);
        strArrayAll6.addAll(strArray1);
        strArrayAll6.addAll(strArray2);
        strArrayAll6.addAll(strArray3);
        strArrayAll6.addAll(strArray4);
        strArrayAll6.addAll(strArray5);
        strArrayAll6.addAll(strArray6);
        strArrayAll6.addAll(strArray7);
        strArrayAll6.addAll(strArray8);
        strArrayAll6.addAll(strArray9);
        System.out.println(strArrayAll6);

    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i : iArr) {
            System.out.println(i + " ");
        }
    }

    public static String getNLastChar(String text, int n) {
        return String.valueOf(text.charAt(text.length() - n));
    }
    */
}
