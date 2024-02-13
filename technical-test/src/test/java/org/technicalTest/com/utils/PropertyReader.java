package org.technicalTest.com.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Esta clase es responsable de leer los datos que se encuentran dentro de un archivo de propiedades y configurarlos
 * donde se llama a la clase.
 * */

public class PropertyReader {

    public static String getProperty(String fileName, String key) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        String propertyValue = null;

        try {
            inputStream = ClassLoader.getSystemResourceAsStream(fileName);
            properties.load(inputStream);
            propertyValue = properties.getProperty(key);
        } catch (FileNotFoundException e) {
        } finally {
            closeInput(inputStream);
            return propertyValue;
        }
    }

    public static void closeInput(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}