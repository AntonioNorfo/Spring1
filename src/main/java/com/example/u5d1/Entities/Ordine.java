package com.example.u5d1.Entities;

import com.example.u5d1.PizzeriaConfig;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {

    private int numeroOrdine;
    private Tavolo tavolo;
    private List<Pizza> pizze;
    private List<Drink> bevande;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, List<Pizza> pizze, List<Drink> bevande, int numeroCoperti) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.pizze = pizze;
        this.bevande = bevande;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = LocalDateTime.now();
        this.statoOrdine = StatoOrdine.IN_CORSO;
        calcolaImportoTotale();
    }

    private void calcolaImportoTotale() {
        double totalePizze = pizze.stream().mapToDouble(Pizza::getPrezzoTotale).sum();
        double totaleBevande = bevande.stream().mapToDouble(Drink::getPrezzo).sum();
        double costoCoperti = numeroCoperti * PizzeriaConfig.getCostoCoperto();
        this.importoTotale = totalePizze + totaleBevande + costoCoperti;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public double getImportoTotale() {
        return importoTotale;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public String getNumeroCoperti() {
        return Integer.toString(numeroCoperti);
    }
}
