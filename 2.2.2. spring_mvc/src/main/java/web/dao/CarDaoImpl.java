package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> carsFromTheList(List<Car> listOfCars, int count) {
        if (count <= 0) {
            switch (count) {
                case 1:
                    listOfCars.get(0);
                    break;
                case 2:
                    listOfCars.subList(0, 2);
                    break;
                case 3:
                    listOfCars.subList(0, 3);
                    break;
                case 4:
                    listOfCars.subList(0, 4);
                default:
                    listOfCars.subList(0, listOfCars.size());
            }
        } else {
            System.out.println("Empty list");
        }
        return listOfCars;
    }
}