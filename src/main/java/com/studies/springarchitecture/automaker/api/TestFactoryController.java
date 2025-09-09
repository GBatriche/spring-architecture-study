package com.studies.springarchitecture.automaker.api;


import com.studies.springarchitecture.automaker.CarStatus;
import com.studies.springarchitecture.automaker.Engine;
import com.studies.springarchitecture.automaker.HondaHRV;
import com.studies.springarchitecture.automaker.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class TestFactoryController {

    @Autowired
    @Aspired
    private Engine engine;


    @PostMapping
    public CarStatus startCar(@RequestBody Key key){
        var car = new HondaHRV(engine);
        return car.getStart(key);
    }
}
