package com.example.u5d1;

import com.example.u5d1.Entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.u5d1"})
public class U5d1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(U5d1Application.class, args);

        Menu menu = context.getBean(Menu.class);
        menu.stampaMenu();
    }
}
