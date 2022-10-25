package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    private final Properties properties = getProperties();

    private static final String PATH =
            "src" + File.separator +
                    "main" + File.separator +
                    "resources" + File.separator +
                    "configuration.properties";


    private Properties getProperties() {

        Properties properties1 = new Properties();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(PATH));
            try {
                properties1.load(bufferedReader);
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return properties1;
    }

    private String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getBoredApiUrl() {
        return getProperty("bored.api.url");
    }
}
