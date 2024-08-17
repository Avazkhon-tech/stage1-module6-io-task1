package com.epam.mjc.io;

import java.util.logging.Logger;

public class NoMoreLineException extends RuntimeException {

    public NoMoreLineException(String message) {
        super(message);
    }
}
