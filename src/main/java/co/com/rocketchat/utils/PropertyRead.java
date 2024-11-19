package co.com.rocketchat.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import static co.com.rocketchat.utils.constants.Properties.*;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getAnonymousLogger;

public class PropertyRead {

    protected static final Properties PROP_DIR = new Properties();
    protected static final Properties PROP_ROUTES = new Properties();
    private static final Logger LOGGER = getAnonymousLogger();

    private PropertyRead() {
    }

    public static Properties getPropRoutes() {
        return PROP_ROUTES;
    }

    public static void load() {
        try {
            InputStream inputStrem = new FileInputStream(RUTA_DIR_PROPERTIES);
            PROP_DIR.load(inputStrem);
        } catch (Exception e) {
            LOGGER.log(SEVERE, " *ERROR* ", e);

        }
        if (System.getProperty(RUTA_ROUTES) != null)
            PROP_DIR.setProperty(RUTA_ROUTES, System.getProperty(RUTA_ROUTES));
        loadRoutes(PROP_DIR.getProperty(RUTA_ROUTES));

    }

    public static void loadRoutes(String ruta) {

        try {
            InputStream inputStrem = new FileInputStream(ruta);
            PROP_ROUTES.load(inputStrem);
        } catch (Exception e) {
            LOGGER.log(SEVERE, " *ERROR* ", e);
        }
        if (System.getProperty(URL_B2B) != null)
            PROP_ROUTES.setProperty(URL_B2B, System.getProperty(URL_B2B));

    }

}
