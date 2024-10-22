package com.example.u5d1.Entities;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private double prezzoBase;
    private List<Topping> toppings;

    public Pizza(String nome, double prezzoBase) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
        this.toppings = new ArrayList<>(); // Inizializza la lista qui
    }

    public double getPrezzoTotale() {
        return prezzoBase + toppings.stream().mapToDouble(Topping::getPrezzo).sum();
    }

    public String getDescrizione() {
        StringBuilder descrizione = new StringBuilder(nome + " con: pomodoro, mozzarella");
        toppings.forEach(topping -> descrizione.append(", ").append(topping.getNome()));
        return descrizione.toString();
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
