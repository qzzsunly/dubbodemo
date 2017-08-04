package life.qzz.dubbodemo;

import life.qzz.dubbodemo.api.CallbackListener;
import life.qzz.dubbodemo.api.CallbackService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * <pre>
 * 描述：
 * 构建组：大道金服科技部
 * 作者:秦在振
 * 邮箱:qinzaizhen@ddjf.com.cn
 * 日期:2017/8/1
 * 版权：大道金服
 * </pre>
 */
public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        ((CallbackService) context.getBean("demoService")).addListener("qzz", new CallbackListener() {
            public void changed(String msg) {
                System.out.println(msg + "I love you.");
            }
        });
        new CountDownLatch(1).await();
    }
}
