package com.ramjava.agendador.buffer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class AgendadorBufferApplication {

	Logger logger = LoggerFactory.getLogger(AgendadorBufferApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AgendadorBufferApplication.class, args);
	}
	//@Scheduled(fixedRate = 2000L, initialDelay = 2000L)
	//@Scheduled(fixedDelayString = "PT2S", initialDelay = 2000L)
	@Scheduled(cron = "*/2 * * * * *") // crontab guru
	public void job() throws InterruptedException {
        logger.info("Hora atual do trabalho {}", new Date());
		Thread.sleep(1000L);
	}

	@Scheduled(cron = "*/2 * * * * *") // crontab guru
	public void job2() throws InterruptedException {
		logger.info("Hora atual do trabalho2 {}", new Date());
		Thread.sleep(1000L);
	}

}
