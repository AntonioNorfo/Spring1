package com.example.u5d1.Entities;

import com.example.u5d1.PizzeriaConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OrdineRunner {

    private static final Logger logger = LoggerFactory.getLogger(OrdineRunner.class);

    @Bean
    public CommandLineRunner run(Menu menu, PizzeriaConfig pizzeriaConfig) {
        return args -> {

            Tavolo tavolo1 = new Tavolo(1, 4);

            Ordine ordine = new Ordine(1, tavolo1, Arrays.asList(menu.getPizze().get(0)), Arrays.asList(menu.getBevande().get(0)), 3);

            logger.info("Ordine n. " + ordine.getNumeroOrdine() + " acquisito per il tavolo n. " + tavolo1.getNumeroTavolo());
            logger.info("Numero coperti: " + ordine.getNumeroCoperti());
            logger.info("Stato Ordine: " + ordine.getStatoOrdine());
            logger.info("Importo Totale: €" + ordine.getImportoTotale());
        };
    }
}
