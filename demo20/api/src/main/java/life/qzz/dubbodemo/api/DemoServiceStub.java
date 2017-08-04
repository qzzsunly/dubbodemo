package life.qzz.dubbodemo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DemoServiceStub implements DemoService{

    private DemoService demoService;

    public DemoServiceStub(DemoService demoService) {
        this.demoService = demoService;
    }

    private Logger logger = LoggerFactory.getLogger(DemoService.class);
    public String sayHello(String name) {
        if (name == null){
            logger.error("请求参数不能为空：name: {}", name);
            //throw new RpcException("请求参数不能为空");
        }
        return demoService.sayHello(name);
    }
}
