package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Scheduled(fixedRate = 10000L)
//	public void fixedRate(){
//		System.out.println("FixedRate new Rate :" +new Date());
//	}

//	@Scheduled(initialDelay = 10000L,fixedDelay = 1000L)
//	public void fixedDelay(){
//		System.out.println("FixedDelay new Delay  :" +new Date());
//	}

//	@Scheduled(cron = "0 00 11 * * *")
//	public void cron(){
//		System.out.println("lorem  :" +new Date());
//	}
}
