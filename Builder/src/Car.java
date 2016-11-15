import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 15.11.16.
 */
public class Car {
    private String name;
    private final BigDecimal millage;

    public Car(BuildCar buildCar) {
        this.name = buildCar.name;
        this.millage = buildCar.millage;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getMillage() {
        return millage;
    }

    public static class BuildCar {
        private String name;
        private BigDecimal millage;

        public BuildCar withName(String name) {
            this.name = name;
            return this;
        }

        public BuildCar withMillage(BigDecimal millage) {
            this.millage = millage;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
