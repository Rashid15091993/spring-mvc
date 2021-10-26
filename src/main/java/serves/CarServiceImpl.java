package serves;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> carsCount(int number) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford", "RED", 1000));
        list.add(new Car("Ferrari", "YELLOW", 700));
        list.add(new Car("Aston Martin", "BLACK", 500));
        list.add(new Car("FIAT", "GREEN", 180));
        list.add(new Car("BMW", "BLUE", 100));

        if (number == 0 || number > 5) {
            return list;
        }
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
