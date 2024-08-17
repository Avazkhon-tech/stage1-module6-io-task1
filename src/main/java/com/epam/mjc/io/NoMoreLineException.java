package com.epam.mjc.io;

import java.util.logging.Logger;

public class NoMoreLineException extends RuntimeException {

    Logger logger = Logger.getLogger(getClass().getName());


    public NoMoreLineException(String message) {
        super(message);
        logger.info(message);
    }
}
