package com.epam.mjc.io;


import java.util.logging.Logger;

public class NoFile extends RuntimeException {

    public NoFile(String message) {
        super(message);
    }
}
