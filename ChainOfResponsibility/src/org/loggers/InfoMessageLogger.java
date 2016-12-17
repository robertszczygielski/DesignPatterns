package org.loggers;

import org.loggers.abstracts.AbstractMessageLogger;
import org.loggers.interfaces.LoggerChain;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public class InfoMessageLogger extends AbstractMessageLogger implements LoggerChain {
    private final LoggerChain nextLoger;

    public InfoMessageLogger(LoggerChain nextLogger) {
        this.nextLoger = nextLogger;
    }

    @Override
    public void setLog(LogScope logScope, String message) {
        if(LogScope.INFO.equals(logScope)) {
            this.message = LogScope.INFO.getType() + message;
        } else {
            this.message = "!!DEFAULT : " + message;
        }
    }

    @Override
    public String getLog() {
        return message;
    }
}
