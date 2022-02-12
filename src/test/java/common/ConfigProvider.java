package common;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Component
public class ConfigProvider {

//    public static void main(String[] args) throws IOException {
//
//        Properties obj = new Properties();
//        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/src/test/data.properties");
//        obj.load(objfile);
//        final String URL = obj.getProperty("url");
//        final String CHROME_DRIVER_PATH = obj.getProperty("chrome.driver.path");
//    }

    public static Properties initProperties() throws IOException {
        Properties obj = new Properties();
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/src/test/data.properties");
        obj.load(objfile);
        return obj;
    }
}
