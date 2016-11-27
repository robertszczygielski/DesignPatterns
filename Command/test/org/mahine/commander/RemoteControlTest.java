package org.mahine.commander;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahine.commander.interfaces.Commander;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class RemoteControlTest {
    @Mock
    private Commander commander;
    private String testString = "testString";

    @Before
    public void setup() {
        Mockito.when(commander.execute()).thenReturn(testString);
    }

    @Test
    public void shouldExecuteCommand() throws Exception {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(commander);

        String result = remoteControl.exe();

        assertEquals(testString, result);
    }
}
