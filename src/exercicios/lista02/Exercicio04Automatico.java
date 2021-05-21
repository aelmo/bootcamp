package exercicios.lista02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04Automatico {
    public static List<String> radixSort(int iArr[]) {
        int maxNumberOfDigits = getMax(iArr);
        String[] sArr = convertIntToStringArray(iArr);
        sArr = addLeftZeros(sArr,maxNumberOfDigits);
        List<String> L0 = new ArrayList<>();
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        List<String> L4 = new ArrayList<>();
        List<String> L5 = new ArrayList<>();
        List<String> L6 = new ArrayList<>();
        List<String> L7 = new ArrayList<>();
        List<String> L8 = new ArrayList<>();
        List<String> L9 = new ArrayList<>();
        for(String elem : sArr){
            String lastDigit = getNLastChar(elem,1);
            System.out.println(lastDigit);
            if(lastDigit.equals("0"))
                L0.add(elem);
            if(lastDigit.equals("1"))
                L1.add(elem);
            if(lastDigit.equals("2"))
                L2.add(elem);
            if(lastDigit.equals("3"))
                L3.add(elem);
            if(lastDigit.equals("4"))
                L4.add(elem);
            if(lastDigit.equals("5"))
                L5.add(elem);
            if(lastDigit.equals("6"))
                L6.add(elem);
            if(lastDigit.equals("7"))
                L7.add(elem);
            if(lastDigit.equals("8"))
                L8.add(elem);
            if(lastDigit.equals("9"))
                L9.add(elem);
        }
        List<String> completeList = new ArrayList<>();
        completeList.addAll(L0);
        completeList.addAll(L1);
        completeList.addAll(L2);
        completeList.addAll(L3);
        completeList.addAll(L4);
        completeList.addAll(L5);
        completeList.addAll(L6);
        completeList.addAll(L7);
        completeList.addAll(L8);
        completeList.addAll(L9);

        for(String elem : completeList){
            System.out.println(elem);
        }
        //Digit 2 para trazer o penultimo digito
        int digit = 2;
        List<String> argList = completeList;
        while(digit <= maxNumberOfDigits){
            List<String> newwList = iterableRadix(argList,digit);

            argList = newwList;
            digit++;
        }

        return argList;


    }
    static List<String> iterableRadix(List<String> list,int digit){
        List<String> L0 = new ArrayList<>();
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        List<String> L4 = new ArrayList<>();
        List<String> L5 = new ArrayList<>();
        List<String> L6 = new ArrayList<>();
        List<String> L7 = new ArrayList<>();
        List<String> L8 = new ArrayList<>();
        List<String> L9 = new ArrayList<>();
        for(String elem : list){
            String lastDigit = getNLastChar(elem,digit);
            if(lastDigit.equals("0"))
                L0.add(elem);
            if(lastDigit.equals("1"))
                L1.add(elem);
            if(lastDigit.equals("2"))
                L2.add(elem);
            if(lastDigit.equals("3"))
                L3.add(elem);
            if(lastDigit.equals("4"))
                L4.add(elem);
            if(lastDigit.equals("5"))
                L5.add(elem);
            if(lastDigit.equals("6"))
                L6.add(elem);
            if(lastDigit.equals("7"))
                L7.add(elem);
            if(lastDigit.equals("8"))
                L8.add(elem);
            if(lastDigit.equals("9"))
                L9.add(elem);
        }
        List<String> completeList = new ArrayList<>();
        completeList.addAll(L0);
        completeList.addAll(L1);
        completeList.addAll(L2);
        completeList.addAll(L3);
        completeList.addAll(L4);
        completeList.addAll(L5);
        completeList.addAll(L6);
        completeList.addAll(L7);
        completeList.addAll(L8);
        completeList.addAll(L9);

        return completeList;
    }

    public static String[] convertIntToStringArray(int array[]){
        String [] sArr = new String[array.length];
        for(int i=0;i<array.length;i++){
            sArr[i] = Integer.toString(array[i]);
        }
        return sArr;
    }

    static int getMax(int arr[])
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int numberOfDigits = String.valueOf(max).length();
        return numberOfDigits;
    }

    static String[] addLeftZeros (String[] sArr,int numberOfDigits){
        String[] newArray = new String[sArr.length];
        String formatVariable = "%"+numberOfDigits+"s";
        for(int i=0; i < newArray.length;i++){
            newArray[i] = String.format(formatVariable,sArr[i]);
            newArray[i] = newArray[i].replace(' ','0');
        }

        return newArray;
    }

    public static String getNLastChar(String text, int n) {
        return String.valueOf(text.charAt(text.length() - n));
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 15320, 6388, 2511, 8};

        List<String> list = radixSort(iArr);
        for(String elem : list){
            System.out.println(elem);
        }

    }
}
