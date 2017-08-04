package life.qzz.dubbodemo.api.impl;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import life.qzz.dubbodemo.api.DemoService;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.in.read();*/

        DemoService demoService = new DemoServiceImpl();
       //应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig("hello");

        //注册中心配置
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://localhost:2181");

        //协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig("dubbo",20880);

        //服务配置
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(demoService);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.export();
        System.in.read();
    }
}
