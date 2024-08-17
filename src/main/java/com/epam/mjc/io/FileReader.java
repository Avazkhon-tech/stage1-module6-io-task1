package com.epam.mjc.io;

import java.io.*;

public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();

        try (BufferedReader in = new BufferedReader(new java.io.FileReader(file))) {


            String line;
            while ((line = in.readLine()) != null) {
                String[] data = line.split(": ");

                String key = data[0];
                String value = data[1];

                switch(key) {
                    case "Name":
                        profile.setName(value);
                        break;
                    case "Age":
                        profile.setAge(Integer.parseInt(value));
                        break;
                    case "Email":
                        profile.setEmail(value);
                        break;
                    case "Phone":
                        profile.setPhone(Long.valueOf(value));
                        break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return profile;

    }
}
