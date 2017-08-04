package life.qzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ImportResource("dubbo.xml")
public class ProducerApplication {

	public static void main(String[] args) throws InterruptedException {
//		SpringApplication.run(ProducerApplication.class, args);
		ApplicationContext app = new SpringApplicationBuilder().sources(ProducerApplication.class).web(false).run(args);
		CountDownLatch closeLatch = app.getBean(CountDownLatch.class);
		closeLatch.await();
	}
}
