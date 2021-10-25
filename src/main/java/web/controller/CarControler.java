package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import serves.CarService;
import serves.CarServiceImpl;

@Controller
public class CarControler {
    CarService carService = new CarServiceImpl();
    @GetMapping(value = "/car")
    public String car(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {

        model.addAttribute("list", carService.carsCount(allCars));
        return "car";
    }
}
