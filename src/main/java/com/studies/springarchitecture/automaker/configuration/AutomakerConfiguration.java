package com.studies.springarchitecture.automaker.configuration;

import com.studies.springarchitecture.automaker.Engine;
import com.studies.springarchitecture.automaker.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomakerConfiguration {

    @Bean
    public Engine engine(){
        var engine = new Engine();
        engine.setPower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setLiterage(2.0);
        engine.setType(MotorType.ASPIRED);
        return engine;
    }
}
