package framework.utils.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

        private static Properties properties;
        private static FileInputStream file;

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

        public static String getBaseApiURI() {
            return getProperties().getProperty("base.api.url");
        }

        public static String getBaseUIURI() {
            return getProperties().getProperty("base.ui.url");
        }

        public static String getPostsEndpoint(){
            return getProperties().getProperty("api.posts.endpoint");
        }
}
