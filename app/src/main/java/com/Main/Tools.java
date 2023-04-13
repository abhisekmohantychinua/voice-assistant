package com.Main;

import edu.cmu.sphinx.api.Configuration;

import java.nio.file.Paths;
import java.time.LocalTime;

public class Tools {
    public static Configuration getConfiguration() {
        Configuration configuration = new Configuration();
        configuration.setSampleRate(21000);
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("src/main/resources/4882.dic");
        configuration.setLanguageModelPath("src/main/resources/4882.lm");
        return configuration;
    }

    public static String getGreetings() {
        String text = null;
        int time = LocalTime.now().getHour();
        text = time >= 6 && time <= 12 ? "Good Morning! How may I start you work?" : time > 12 && time <= 17 ? "Good Afternoon! Take some easy tasks." : time > 17 && time <= 22 ? "Good Evening! This is practicing time." : "Good Night! Do a work or get relaxed.";

        return text;
    }
    public static boolean in(String string,String word){
        for (String s :
                string.split(" ")) {
            if (s.equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }
}
