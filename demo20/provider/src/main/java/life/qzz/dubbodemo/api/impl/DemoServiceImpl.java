package life.qzz.dubbodemo.api.impl;


import life.qzz.dubbodemo.api.BusinessException;
import life.qzz.dubbodemo.api.DemoService;

public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        if (name == null){
            throw new BusinessException("请求参数不能为空");
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }
}
