package life.qzz.dubbodemo.api.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

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
public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.in.read();
    }
}
