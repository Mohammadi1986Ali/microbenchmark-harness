package com.javalab.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        LOGGER.info("Application#main");

        org.openjdk.jmh.Main.main(args);
    }
}
