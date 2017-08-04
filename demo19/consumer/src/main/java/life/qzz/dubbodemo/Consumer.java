package life.qzz.dubbodemo;


import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    private static Logger logger = LoggerFactory.getLogger(Consumer.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService service =  context.getBean(DemoService.class);
        logger.debug("服务端返回：{}",service.getUser("qzz"));
    }
}
