package com.haythem.gestionsociete;

import com.haythem.gestionsociete.domain.Quote;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class GestionSocieteApplication {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args)
    {
        SpringApplication.run(GestionSocieteApplication.class, args);
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Quote.class);
        logger.info(quote.toString());
    }

}
