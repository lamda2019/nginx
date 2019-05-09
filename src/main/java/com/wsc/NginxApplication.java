package com.wsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NginxApplication {
/*
* 开启nginx后
* 访问：
* http://localhost:7000/
* 或
* http://localhost:7000/api/
* */
    public static void main(String[] args) {
        SpringApplication.run(NginxApplication.class, args);
    }

}
