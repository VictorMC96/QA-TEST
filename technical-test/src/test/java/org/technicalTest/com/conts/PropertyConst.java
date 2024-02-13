package org.technicalTest.com.conts;


import org.technicalTest.com.utils.PropertyReader;

/**
 * Constantes donde se establecen los valores de nombre de usuario y contraseña.
 * */
public class PropertyConst {
    public static final String Url = PropertyReader.getProperty("application.properties", "url");
    public static final String User = PropertyReader.getProperty("application.properties", "user");
    public static final String Pass = PropertyReader.getProperty("application.properties", "pass");
}