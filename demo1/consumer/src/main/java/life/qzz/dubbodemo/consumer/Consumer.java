package life.qzz.dubbodemo.consumer;

import life.qzz.dubbodemo.api.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 描述：
 * 构建组：大道金服科技部
 * 作者:秦在振
 * 邮箱:qinzaizhen@ddjf.com.cn
 * 日期:2017/7/25
 * 版权：大道金服
 * </pre>
 */
public class Consumer {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        System.out.println( context.getBean(DemoService.class).sayHello("qzz"));
    }
}
