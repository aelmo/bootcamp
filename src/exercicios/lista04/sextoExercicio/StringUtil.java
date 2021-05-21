package exercicios.lista04.sextoExercicio;

import static exercicios.lista04.sextoExercicio.StringUtil.indexOfN;
import static exercicios.lista04.sextoExercicio.StringUtil.rpad;

public class StringUtil {

    public static String rpad(String s, char c, int n) {
        String formattedString = s;

        for(int i = 0; i<n; i++) {
            formattedString += c;
        }

        return formattedString;
    }

    public static String ltrim(String s) {
        return s.replaceAll("^\\s+", "");
    }

    public static String rtrim(String s) {
        return s.replaceAll("\\s+$", "");
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN (String s, char c, int n) {
        int counter = 1;
        for (int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                if(counter == n) {
                    return i;
                }
                counter++;
            }
        }
        return -1;
    }

}

class Main {
    public static void main(String[] args) {
        String s = "arroz        ";
        System.out.println(StringUtil.trim(s) + "aa");
        System.out.println(indexOfN(s, 'r', 2));
    }
}
