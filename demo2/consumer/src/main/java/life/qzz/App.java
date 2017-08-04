package life.qzz;

import life.qzz.dubbodemo.action.DemoController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new ClassPathXmlApplicationContext("consumer.xml").getBean(DemoController.class).sayHello("qzzz");
    }
}
