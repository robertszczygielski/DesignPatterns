package org.mahine.commander;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mahine.commander.interfaces.Commander;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.thinking.machine.interfaces.InternetOfThings;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 27.11.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class MachineOnSwitcherTest {
    @Mock
    private InternetOfThings internetOfThings;
    private Commander machineOn;

    private final String testString = "TestString";

    @Before
    public void setup() {
        Mockito.when(internetOfThings.setOn()).thenReturn(testString);
        machineOn = new MachineOnSwitcher(internetOfThings);
    }

    @Test
    public void shouldReturnTestStrings() throws Exception {
        String result = machineOn.execute();

        assertEquals(testString, result);
    }
}
