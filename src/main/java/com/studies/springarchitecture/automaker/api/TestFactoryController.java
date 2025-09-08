package com.studies.springarchitecture.automaker.api;


import com.studies.springarchitecture.automaker.CarStatus;
import com.studies.springarchitecture.automaker.Engine;
import com.studies.springarchitecture.automaker.HondaHRV;
import com.studies.springarchitecture.automaker.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFactoryController {

    @Autowired
    private Engine engine;


    @PostMapping
    public CarStatus startCar(@RequestBody Key key){
        var car = new HondaHRV(engine);
        return car.getStart(key);
    }
}
