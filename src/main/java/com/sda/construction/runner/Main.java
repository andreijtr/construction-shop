package com.sda.construction.runner;

import com.sda.construction.config.DIConfig;
import com.sda.construction.dto.CaramidaDTO;
import com.sda.construction.service.CaramidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sda.construction.*")
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
