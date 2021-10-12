package com.solvd.askomar.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Closeable;
import java.io.IOException;

public class Unnessesary implements Closeable {

    private static Logger logger;

    {
        logger = LogManager.getLogger(getClass().getName());
    }

    @Override
    public void close() throws IOException {
        logger.debug("Called close method of Unnessesary classs");
    }
}
