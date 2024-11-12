package com.roke.plagiarismchecker.utils;

import java.util.logging.Logger;

public class Log {
    static Logger logger = Logger.getLogger(Log.class.getName());
    public static void info(String message) {
        //add timestamp to log message
        message = "[" + java.time.LocalTime.now() + "] " + message;
        logger.info(message);
    }
}
