package org.loggers.abstracts;

import org.loggers.interfaces.LoggerChain;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public abstract class AbstractMessageLogger {
    protected String message;
    protected LoggerChain.LogScope logScope;
}
