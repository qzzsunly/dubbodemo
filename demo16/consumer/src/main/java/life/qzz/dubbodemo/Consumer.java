package life.qzz.dubbodemo;

import com.alibaba.dubbo.rpc.RpcContext;
import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * <pre>
 * 描述：
 * 构建组：大道金服科技部
 * 作者:秦在振
 * 邮箱:qinzaizhen@ddjf.com.cn
 * 日期:2017/7/26
 * 版权：大道金服
 * </pre>
 */
public class Consumer {
    private static Logger logger = LoggerFactory.getLogger(Consumer.class);
    /*public static void main(String[] args) throws ExecutionException, InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService service = context.getBean(DemoService.class);
        logger.debug("调用服务");
        logger.debug("服务端返回结果：{}",service.sayHello("qzz"));
        logger.debug("调用服务2");
        logger.debug("服务端返回结果：{}",service.getDate(new Date()));
    }*/


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService service = context.getBean(DemoService.class);
        logger.debug("服务端返回结果：{}",service.sayHello("qzz"));
        Future helloFuture = RpcContext.getContext().getFuture();
        logger.debug("服务端返回结果：{}",service.getDate(new Date()));
        Future dateFuture = RpcContext.getContext().getFuture();
        logger.debug("服务端返回结果：{}",helloFuture.get());
        logger.debug("服务端返回结果：{}",dateFuture.get());
    }



}
