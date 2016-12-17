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
import static org.loggers.interfaces.LoggerChain.*;

/**
 * Created by Robert Szczygielski on 17.12.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class InfoLogTest {
    @Mock
    private LoggerChain mockLogger;

    private final String myLog = "MyLog";

    @Before
    public void setup() {
        Mockito.doNothing().when(mockLogger).setLog(Matchers.any(LogScope.class), Matchers.anyString());
    }

    @Test
    public void shouldReturnInfoMyLog() throws Exception {
        LoggerChain logger = new InfoMessageLogger(mockLogger);
        logger.setLog(LogScope.INFO, myLog);
        String result = logger.getLog();

        assertEquals(LogScope.INFO.getType() + myLog, result);
    }
}
