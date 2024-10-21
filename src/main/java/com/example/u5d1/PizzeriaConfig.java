package com.example.u5d1;

import com.example.u5d1.Entities.Drink;
import com.example.u5d1.Entities.Menu;
import com.example.u5d1.Entities.Pizza;
import com.example.u5d1.Entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class PizzeriaConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 2.00, "Proteine 12g, Grassi 15g");
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 1.50, "Carboidrati 13g");
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 5.00);
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza hawaiianPizza = new Pizza("Hawaiian Pizza", 5.00);
        hawaiianPizza.getToppings().add(prosciutto());
        hawaiianPizza.getToppings().add(ananas());
        return hawaiianPizza;
    }

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.00, "Zuccheri 10g");
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua", 1.00, "Zero calorie");
    }

    @Bean
    public Menu menu() {
        return new Menu(Arrays.asList(margherita(), hawaiianPizza()), Arrays.asList(cocaCola(), acqua()));
    }
}
