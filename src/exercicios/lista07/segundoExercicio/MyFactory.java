package exercicios.lista07.segundoExercicio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance(String objName) throws ClassNotFoundException, IOException {
        Properties prop = new Properties();
        FileInputStream input = new FileInputStream("/Users/jaijuni/Documents/Projects/bootcamp/src/exercicios/lista07/segundoExercicio/MyFactory.properties");

        prop.load(input);
        prop.get("sorter");

        return Class.forName(prop.getProperty("sorter"));
    }
}
