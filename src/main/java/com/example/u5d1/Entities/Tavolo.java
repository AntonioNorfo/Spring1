package com.example.u5d1.Entities;

public class Tavolo {

    private int numeroTavolo;
    private int copertiMassimi;
    private StatoTavolo stato;

    public Tavolo(int numeroTavolo, int copertiMassimi) {
        this.numeroTavolo = numeroTavolo;
        this.copertiMassimi = copertiMassimi;
        this.stato = StatoTavolo.LIBERO;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public int getCopertiMassimi() {
        return copertiMassimi;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void setStato(StatoTavolo stato) {
        this.stato = stato;
    }
}
