package racingcar.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cars {

    public List<Car> getCars(String[] names) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Car car = new Car(names[i]);
            cars.add(car);
        }
        return cars;
    }

    public Map<String, Integer> makeNamePositionMap(List<Car> carList) {
        Map<String, Integer> namePosition = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            namePosition.put(carList.get(i).getName(), carList.get(i).getPosition());
        }
        return namePosition;
    }
}
