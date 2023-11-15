package org.example;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try (InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("application.properties")) {
            byte[] bytes = inputStream.readAllBytes();
            String line = new String(bytes);
            String[] keyToValue = line.split("=");
            String key = keyToValue[0];
            String value = keyToValue[1];
            String text = StringUtils.center(key + "=" + value, 100);
            System.out.println(text);

        } catch (IOException e) {

        }

    }
}