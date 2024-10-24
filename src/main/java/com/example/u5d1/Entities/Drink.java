package com.example.u5d1.Entities;

public class Drink {
    private String nome;
    private double prezzo;
    private String informazioniNutrizionali;

    public Drink(String nome, double prezzo, String informazioniNutrizionali) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.informazioniNutrizionali = informazioniNutrizionali;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getInformazioniNutrizionali() {
        return informazioniNutrizionali;
    }
}
