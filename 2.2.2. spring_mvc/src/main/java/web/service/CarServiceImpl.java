package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> carsFromTheList(int count) {
        return carDao.carsFromTheList(count);
    }
}