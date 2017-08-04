package life.qzz.dubbodemo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import life.qzz.dubbodemo.api.DemoService;


@Service(version = "1.0")
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "hello :" + name;
    }
}
