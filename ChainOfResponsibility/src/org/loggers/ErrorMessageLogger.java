package org.loggers;

import org.loggers.abstracts.AbstractMessageLogger;
import org.loggers.interfaces.LoggerChain;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public class ErrorMessageLogger extends AbstractMessageLogger implements LoggerChain {
    private LoggerChain nextLogger;

    public ErrorMessageLogger(LoggerChain nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void setLog(LogScope logScope, String message) {
        if(LogScope.ERROR.equals(logScope)) {
            this.message = LogScope.ERROR.getType() + message;
            this.logScope = logScope;
        } else {
            nextLogger.setLog(logScope, message);
        }
    }

    @Override
    public String getLog() {
        if(LogScope.ERROR.equals(this.logScope)) {
            return message;
        } else {
            return nextLogger.getLog();
        }
    }
}
