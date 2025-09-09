package com.studies.springarchitecture.automaker.configuration;

import com.studies.springarchitecture.automaker.Engine;
import com.studies.springarchitecture.automaker.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AutomakerConfiguration {

    @Primary
    @Bean(name = "engineEletric")
    public Engine engineEletric(){
        var engine = new Engine();
        engine.setPower(120);
        engine.setCylinders(4);
        engine.setModel("XPT-3");
        engine.setLiterage(2.0);
        engine.setType(MotorType.ELETRIC);
        return engine;
    }

    @Bean(name = "engineAspired")
    public Engine engineAspired(){
        var engine = new Engine();
        engine.setPower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-0");
        engine.setLiterage(1.4);
        engine.setType(MotorType.ASPIRED);
        return engine;
    }

    @Bean(name = "engineTurbo")
    public Engine engineTurbo(){
        var engine = new Engine();
        engine.setPower(120);
        engine.setCylinders(4);
        engine.setModel("XPTO-01");
        engine.setLiterage(1.5);
        engine.setType(MotorType.TURBO);
        return engine;
    }
}
