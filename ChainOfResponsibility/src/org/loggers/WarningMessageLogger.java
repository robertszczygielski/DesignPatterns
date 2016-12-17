package org.loggers;

import org.loggers.abstracts.AbstractMessageLogger;
import org.loggers.interfaces.LoggerChain;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public class WarningMessageLogger extends AbstractMessageLogger implements LoggerChain {
    private LoggerChain nextLogger;

    public WarningMessageLogger(LoggerChain nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void setLog(LogScope logScope, String message) {
        if(LogScope.WARNING.equals(logScope)) {
            this.message = LogScope.WARNING.getType() + message;
            this.logScope = logScope;
        } else {
            nextLogger.setLog(logScope, message);
        }
    }

    @Override
    public String getLog() {
        if(LogScope.WARNING.equals(this.logScope)) {
            return message;
        } else {
            return nextLogger.getLog();
        }
    }
}
