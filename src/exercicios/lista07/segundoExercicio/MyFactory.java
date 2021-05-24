package exercicios.lista07.segundoExercicio;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {

    public static Sorter getInstance(String objName) throws ClassNotFoundException, IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        FileInputStream input = new FileInputStream("./src/exercicios/lista07/segundoExercicio/MyFactory.properties");

        prop.load(input);
        prop.get("sorter");

        return (Sorter) Class.forName(prop.get("sorter").toString()).getConstructor().newInstance();
    }
}
