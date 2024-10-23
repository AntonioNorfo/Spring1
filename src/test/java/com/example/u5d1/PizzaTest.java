package com.example.u5d1;

import com.example.u5d1.Entities.Pizza;
import com.example.u5d1.Entities.Topping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PizzaTest {

    @Test
    public void testPrezzoBasePizzaMargherita() {
        Pizza margherita = new Pizza("Margherita", 5.00);
        System.out.println("Esecuzione del test Prezzo Base Pizza Margherita");
        System.out.println("Prezzo Totale atteso: 5.00, Prezzo Totale calcolato: " + margherita.getPrezzoTotale());
        assertEquals(5.00, margherita.getPrezzoTotale());
    }

    @Test
    public void testPrezzoPizzaConTopping() {
        Pizza margherita = new Pizza("Margherita", 5.00);
        Topping prosciutto = new Topping("Prosciutto", 2.00, "Proteine 12g, Grassi 15g");
        margherita.getToppings().add(prosciutto);
        System.out.println("Esecuzione del test Prezzo Pizza con Topping (Prosciutto)");
        System.out.println("Prezzo Totale atteso: 7.00, Prezzo Totale calcolato: " + margherita.getPrezzoTotale());
        assertEquals(7.00, margherita.getPrezzoTotale());
    }

    @Test
    public void testAggiuntaTopping() {
        Pizza margherita = new Pizza("Margherita", 5.00);
        Topping prosciutto = new Topping("Prosciutto", 2.00, "Proteine 12g, Grassi 15g");
        margherita.getToppings().add(prosciutto);
        System.out.println("Esecuzione del test Aggiunta Topping");
        System.out.println("Numero di Topping atteso: 1, Numero di Topping calcolato: " + margherita.getToppings().size());
        assertEquals(1, margherita.getToppings().size());
    }

    @Test
    public void testDescrizionePizza() {
        Pizza margherita = new Pizza("Margherita", 5.00);
        margherita.getToppings().add(new Topping("Ananas", 1.50, "Carboidrati 13g"));
        String descrizione = margherita.getDescrizione();
        System.out.println("Esecuzione del test Descrizione Pizza");
        System.out.println("Descrizione attesa: deve contenere 'Ananas', Descrizione calcolata: " + descrizione);
        assertTrue(descrizione.contains("Ananas"));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({
            "Margherita, 5.00",
            "Hawaiian Pizza, 7.00"
    })
    public void testPrezzoParametrico(String nomePizza, double prezzoTotaleAtteso) {
        Pizza pizza;
        if (nomePizza.equals("Margherita")) {
            pizza = new Pizza("Margherita", 5.00);
        } else {
            pizza = new Pizza("Hawaiian Pizza", 5.00);
            pizza.getToppings().add(new Topping("Prosciutto", 2.00, "Proteine 12g, Grassi 15g"));
        }
        System.out.println("Esecuzione del test Prezzo Parametrico");
        System.out.println("Pizza: " + nomePizza + ", Prezzo Totale atteso: " + prezzoTotaleAtteso + ", Prezzo Totale calcolato: " + pizza.getPrezzoTotale());
        assertEquals(prezzoTotaleAtteso, pizza.getPrezzoTotale());
    }
}
