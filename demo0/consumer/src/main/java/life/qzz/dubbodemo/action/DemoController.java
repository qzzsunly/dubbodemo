package life.qzz.dubbodemo.action;

import com.alibaba.dubbo.config.annotation.Reference;
import life.qzz.dubbodemo.api.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoController {
    @Reference(version = "1.0")
    private DemoService demoService;
    public void sayHello(String name){
        System.out.println(demoService.sayHello(name));
    }
}
