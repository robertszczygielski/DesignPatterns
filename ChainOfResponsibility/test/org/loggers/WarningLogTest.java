package org.loggers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.loggers.interfaces.LoggerChain;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class WarningLogTest {
    @Mock
    private LoggerChain mockLogger;

    private final String myLog = "MyLog";

    @Before
    public void setup() {
        Mockito.doNothing().when(mockLogger).setLog(Matchers.any(LoggerChain.LogScope.class), Matchers.anyString());
    }

    @Test
    public void shouldReturnWarningMyLog() throws Exception {
        LoggerChain logger = new WarningMessageLogger(mockLogger);
        logger.setLog(LoggerChain.LogScope.WARNING, myLog);
        String result = logger.getLog();

        assertEquals(LoggerChain.LogScope.WARNING.getType() + myLog, result);
    }
}
