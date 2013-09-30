package org.slf4j.log4net;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Demo. </p>
 *
 * @author anavarro - Sep 27, 2013
 *
 */
public class Demo {

    /**
     * main.
     *
     * @param args
     */
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Demo.class);
        logger.debug("Hello World");

    }

}
