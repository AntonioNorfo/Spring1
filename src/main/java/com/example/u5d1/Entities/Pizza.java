package com.example.u5d1.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Pizza {
    private String nome;
    private double prezzoBase;
    private List<com.PizzeriaConfig.model.Topping> toppings = new ArrayList<>();

    public Pizza(String nome, double prezzoBase) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
    }

    public double getPrezzoTotale() {
        return prezzoBase + toppings.stream().mapToDouble(Topping::getPrezzo).sum();
    }

    public String getDescrizione() {
        StringBuilder descrizione = new StringBuilder(nome + " con: pomodoro, mozzarella");
        toppings.forEach(topping -> descrizione.append(", ").append(topping.getNome()));
        return descrizione.toString();
    }

    public Calendar getToppings() {
    }
}
