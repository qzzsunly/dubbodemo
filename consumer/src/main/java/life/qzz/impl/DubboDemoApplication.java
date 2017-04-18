package life.qzz.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("dubbo.xml")
public class DubboDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboDemoApplication.class, args);
	}
}
