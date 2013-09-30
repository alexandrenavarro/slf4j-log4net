package org.slf4j.log4net;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class Log4NetLoggerFactory implements ILoggerFactory {

    public Logger getLogger(String aArg0) {
        return new Log4NetLoggerAdapter();
    }

}
