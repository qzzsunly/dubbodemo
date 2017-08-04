package life.qzz;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import life.qzz.dubbodemo.api.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* System.out.println( "Hello World!" );
        new ClassPathXmlApplicationContext("consumer.xml").getBean(DemoController.class).sayHello("qzzz");*/

        //应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig("hello");

        //注册中心配置
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://localhost:2181");


        //引用配置
        ReferenceConfig<DemoService> r = new ReferenceConfig<>();
        r.setInterface(DemoService.class);
        r.setRegistry(registryConfig);
        r.setApplication(applicationConfig);
        DemoService service = r.get();//注意：此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
        System.out.println( service.sayHello("qzz"));
    }
}
