package com.example.u5d1.Entities;

public class Topping {
    private double prezzo;
    private String nome;
    private String informazioniNutrizionali;

    public Topping(String nome, double prezzo, String informazioniNutrizionali) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.informazioniNutrizionali = informazioniNutrizionali;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getInformazioniNutrizionali() {
        return informazioniNutrizionali;
    }
}
