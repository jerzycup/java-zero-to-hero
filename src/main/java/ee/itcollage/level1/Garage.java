package ee.itcollage.level1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Ferrari> cars = new ArrayList<>();

    public void addCars(Ferrari car) {
        this.cars.add(car);
    }

    public List<Ferrari> getCars() {
        return cars;
    }
}
