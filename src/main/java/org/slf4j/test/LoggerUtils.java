package org.slf4j.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * <p>LoggerUtils. </p>
 *
 * @author anavarro - Oct 1, 2013
 *
 */
public class LoggerUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtils.class);

    /**
     * log.
     *
     * @param s
     */
    public static void log(final String s) {
        LOGGER.debug(s);
    }
    
}
