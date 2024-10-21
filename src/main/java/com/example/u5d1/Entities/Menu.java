package com.example.u5d1.Entities;

import java.util.List;

public class Menu {
    private final List<Pizza> pizze;
    private final List<Drink> bevande;

    public Menu(List<Pizza> pizze, List<Drink> bevande) {
        this.pizze = pizze;
        this.bevande = bevande;
    }

    public void stampaMenu() {
        System.out.println("---- Menu Pizzeria ----");
        System.out.println("Pizze:");
        pizze.forEach(pizza -> System.out.println(pizza.getDescrizione() + " - Prezzo: €" + pizza.getPrezzoTotale()));

        System.out.println("\nBevande:");
        bevande.forEach(drink -> System.out.println(drink.getNome() + " - Prezzo: €" + drink.getPrezzo()));
    }
}
