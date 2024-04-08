package com.hxy.lab.axe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxy.lab.axe")
public class AxeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxeApplication.class, args);
    }

}
