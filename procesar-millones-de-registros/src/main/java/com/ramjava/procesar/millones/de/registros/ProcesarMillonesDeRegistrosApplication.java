package com.ramjava.procesar.millones.de.registros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// By default, Spring Batch is synchronous
@SpringBootApplication
public class ProcesarMillonesDeRegistrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcesarMillonesDeRegistrosApplication.class, args);
	}

}
