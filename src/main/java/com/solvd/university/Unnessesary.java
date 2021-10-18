package com.solvd.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Closeable;

public class Unnessesary implements Closeable {

    private static final Logger logger = LogManager.getLogger(Unnessesary.class);

    @Override
    public void close() {
        logger.debug("Called close method of Unnessesary classs");
    }
}
