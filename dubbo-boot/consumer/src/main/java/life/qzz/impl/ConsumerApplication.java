package life.qzz.impl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("dubbo.xml")
public class ConsumerApplication {

	public static void main(String[] args) throws InterruptedException {
//		SpringApplication.run(DubboDemoApplication.class, args);
		ApplicationContext app = new SpringApplicationBuilder().sources(ConsumerApplication.class).web(false).run(args);
//		Thread.sleep(5000);
		TestRegistryService service =  app.getBean(TestRegistryService.class);
		System.out.println(service.hello("qzz test consumer"));
		CountDownLatch closeLatch = app.getBean(CountDownLatch.class);
		closeLatch.await();
	}
}
