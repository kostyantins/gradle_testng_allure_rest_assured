package util;

import java.io.FileWriter;
import java.io.IOException;

public class ConfigurationProvider {

    public static void main(String[] args) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("src/test/resources/environment.properties");
            fileWriter.write("OSName: " + System.getProperty("os.name") + "\n");
            fileWriter.write("OSVersion: " + System.getProperty("os.version") + "\n");
            fileWriter.write("OSByte: " + System.getProperty("os.arch") + "\n");
            fileWriter.write("JavaVersion: " + System.getProperty("java.runtime.version") + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
