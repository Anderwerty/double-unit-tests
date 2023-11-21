package org.lesson5;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Log4j2
public class Example0 {
    //https://logging.apache.org/log4j/log4j-2.1/manual/configuration.html
    // task add file appender, limitation to file size, filename should contain date


    private static final Logger LOGGER = LogManager.getLogger(Example0.class);

    public static void main(String[] args) {
        LOGGER.log(Level.ERROR, "");
        LOGGER.error("message");
//        LOGGER.info(args[2]);

        // log --> LOGGER
        log.error("message_2");
    }
}
