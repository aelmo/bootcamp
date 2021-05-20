package exercicios.lista.util;

public class ValidationsUtil {

    public static boolean isNumeroPrimo(final int numero) {
        if (numero <= 1)
            return false;

        else if (numero == 2)
            return true;

        else if (numero % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2)
            if (numero % i == 0)
                return false;

        return true;
    }
}
