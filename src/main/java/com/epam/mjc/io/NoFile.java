package com.epam.mjc.io;


import java.util.logging.Logger;

public class NoFile extends RuntimeException {
    Logger logger = Logger.getLogger(getClass().getName());

    public NoFile(String message) {
        super(message);
        logger.info(message);
    }
}
