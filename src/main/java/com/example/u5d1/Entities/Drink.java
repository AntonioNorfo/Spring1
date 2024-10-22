package com.example.u5d1.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
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

    public Object getPrezzo() {
        return prezzo;
    }
}
