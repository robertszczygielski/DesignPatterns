import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Robert Szczygielski on 15.11.16.
 */
public class BuilderCarTest {
    private String carName = "some Car";
    private BigDecimal millage = BigDecimal.ONE;

    @Test
    public void shouldReturnCarWithNameAfterBuild() throws Exception {
        Car car = new Car.BuildCar()
                    .withName(carName)
                    .build();
        String result = car.getName();

        assertEquals(carName, result);
    }

    @Test
    public void shouldReturnCarWithMillageAfterBuild() throws Exception {
        Car car = new Car.BuildCar()
                    .withMillage(millage)
                    .build();
        BigDecimal result = car.getMillage();

    assertEquals(millage, result);
    }
}
