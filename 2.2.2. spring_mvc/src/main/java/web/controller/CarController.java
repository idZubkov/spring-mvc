package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public List<Car> printCarList(ModelMap modelMap) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "Blue color", 3));
        carList.add(new Car("Dodge", "Black color", 55));
        carList.add(new Car("Mazda", "Red color", 15));
        carList.add(new Car("Toyota", "Brown color", 18));
        carList.add(new Car("Opel", "Grey color", 9));
        modelMap.addAttribute("carList", carList);
        return carList;
    }
}