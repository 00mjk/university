package com.solvd.askomar.university;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Closeable;
import java.io.IOException;

public class Unnessesary implements Closeable {

    private static final Logger logger = LogManager.getLogger(Unnessesary.class);

    @Override
    public void close() throws IOException {
        logger.debug("Called close method of Unnessesary classs");
    }
}
