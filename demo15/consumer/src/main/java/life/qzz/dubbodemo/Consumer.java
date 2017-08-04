package life.qzz.dubbodemo;

import com.alibaba.dubbo.rpc.RpcContext;
import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

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
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoService service = context.getBean(DemoService.class);
        logger.debug("服务端返回结果：{}",service.sayHello("qzz"));
        logger.debug("提供者的主机：{}",RpcContext.getContext().getRemoteHost());
        logger.debug("是否消费者：{}",RpcContext.getContext().isConsumerSide());
        logger.debug("应用名：{}",RpcContext.getContext().getUrl().getParameter("application"));
        logger.debug("方法名：{}",RpcContext.getContext().getUrl().getParameter("methods"));
        logger.debug("方法名：{}",RpcContext.getContext().getMethodName());

        logger.debug("服务端返回结果：{}",service.getDate(new Date()));
        logger.debug("提供者的主机：{}",RpcContext.getContext().getRemoteHost());
        logger.debug("是否消费者：{}",RpcContext.getContext().isConsumerSide());
        logger.debug("应用名：{}",RpcContext.getContext().getUrl().getParameter("application"));
        logger.debug("方法名：{}",RpcContext.getContext().getUrl().getParameter("methods"));
        logger.debug("方法名：{}",RpcContext.getContext().getMethodName());

    }
}
