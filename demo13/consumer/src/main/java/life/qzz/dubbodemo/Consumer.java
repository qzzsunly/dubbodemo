package life.qzz.dubbodemo;

import com.alibaba.dubbo.rpc.service.GenericService;
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
        GenericService genericService = (GenericService) context.getBean("demoService");
        String result = (String) genericService.$invoke("sayHello",new String[]{"java.lang.String"}, new Object[]{"qzz"});
        logger.debug("服务端返回结果：{}",result);

        Date result2 = (Date) genericService.$invoke("getDate",new String[]{"java.util.Date"}, new Object[]{new Date()});
        logger.debug("服务端返回结果：{}",result2);
    }
}
