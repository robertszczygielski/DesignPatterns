package org.loggers;

import org.junit.Test;
import org.loggers.interfaces.LoggerChain;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
public class GlobalLoggerTest {
    private final String message = "Message";

    @Test
    public void shouldReturnInfoMessage() throws Exception {
        GlobalLogger globalLogger = new GlobalLogger();
        globalLogger.setLog(LoggerChain.LogScope.INFO, message);

        String result = globalLogger.getLog();
        assertEquals(LoggerChain.LogScope.INFO.getType() + message, result);
    }
}
