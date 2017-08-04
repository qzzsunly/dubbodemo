package life.qzz.dubbodemo;


import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {

    private static Logger logger = LoggerFactory.getLogger(Consumer.class);
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        final DemoService service =  context.getBean(DemoService.class);

        Runnable runnable = new Runnable() {
            public void run() {
                logger.debug("服务端返回：{}",service.getUser("qzz"));
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();

        System.in.read();
    }
}
