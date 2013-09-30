package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.log4net.Log4NetLoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {

    
    private static StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    
    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
      }
    
    public ILoggerFactory getLoggerFactory() {
        return new Log4NetLoggerFactory();
    }

    public String getLoggerFactoryClassStr() {
        return "Log4NetLoggerFactory";
    }

}
