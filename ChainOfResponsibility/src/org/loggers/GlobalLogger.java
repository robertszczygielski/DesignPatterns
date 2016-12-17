package org.loggers;

import org.loggers.interfaces.LoggerChain;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public class GlobalLogger {
    private LoggerChain logger;

    public GlobalLogger() {
        LoggerChain info = new InfoMessageLogger(null);
        LoggerChain warning = new WarningMessageLogger(info);
        LoggerChain error = new ErrorMessageLogger(warning);

        logger = error;
    }

    public void setLog(LoggerChain.LogScope logScope, String message) {
        logger.setLog(logScope, message);
    }

    public String getLog() {
        return logger.getLog();
    }
}
