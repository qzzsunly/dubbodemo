package life.qzz.dubbodemo.api.impl;


import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class DemoServiceImpl implements DemoService{
    private Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);


    @PostConstruct
    public void init(){

        try {
            logger.debug("服务初始化开始");
            Thread.sleep(20000);
            logger.debug("服务初始化结束");
        } catch (InterruptedException e) {
            logger.error("异常",e);
        }

    }

    public String getUser(String name) {
        return null;
    }
}
