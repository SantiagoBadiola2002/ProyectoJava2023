package logica;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuracion {

    private static Configuracion instancia = null;
    private String homeDir;
    private String publishURL;
    private String filePath;
    private Properties propiedades;

    private Configuracion() {
        homeDir = System.getProperty("user.home");

        filePath = homeDir + File.separator + "LAB_DE_APLICACIONES" + File.separator
                + "PAP___LAB-main" + File.separator + "Central Server" + File.separator + "servidor.properties";

        try {
            // Cargar propiedades desde el archivo externo
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
            fileInputStream.close();

            // Obtener valores de propiedades
            String host = properties.getProperty("host");
            String port = properties.getProperty("port");
            String path = properties.getProperty("path");

            // Construir la URL
            publishURL = "http://" + host + ":" + port + path;
            System.out.println(publishURL);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Corroborar que la carpeta .turismoUy y .properties se encuentren en el Home del usuario");
        }

    }

    public static Configuracion getInstance() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getHomeDir() {
        return homeDir;
    }

    public String getPublishURL() {
        return publishURL;
    }

    public String getFilePath() {
        return filePath;
    }

    public Properties getPropiedades() {
        return propiedades;
    }
}
