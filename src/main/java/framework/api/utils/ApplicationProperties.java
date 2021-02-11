package framework.api.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {

        private static Properties properties;
        private static FileInputStream file;

        private ApplicationProperties() {}

        private static synchronized Properties getProperties() {
            if (properties == null) {
                properties = new Properties();
            }
            try {
                file = new FileInputStream("src/main/resources/application.properties");
                properties.load(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return properties;
        }

        public static String getBaseURI() {
            return getProperties().getProperty("base.url");
        }
}
