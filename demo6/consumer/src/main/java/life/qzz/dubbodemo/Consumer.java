package life.qzz.dubbodemo;

import life.qzz.dubbodemo.controller.DemoController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.getBean(DemoController.class).hello("qzz");
    }
}
