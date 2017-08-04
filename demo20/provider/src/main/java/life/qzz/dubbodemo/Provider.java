package life.qzz.dubbodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Provider
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.in.read();
    }
}
