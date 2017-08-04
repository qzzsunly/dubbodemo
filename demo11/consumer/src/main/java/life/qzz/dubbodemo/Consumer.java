package life.qzz.dubbodemo;

import com.alibaba.dubbo.rpc.RpcException;
import life.qzz.dubbodemo.api.User;
import life.qzz.dubbodemo.api.ValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.validation.ConstraintViolationException;

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
    private static  Logger logger = LoggerFactory.getLogger(Consumer.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        User user = new User("qzz",1);
        try {
            context.getBean(ValidationService.class).save(user);
        } catch (RpcException e) {
            logger.error("失败",e);
            logger.error(((ConstraintViolationException) e.getCause()).getConstraintViolations().toString());
        }
    }
}
