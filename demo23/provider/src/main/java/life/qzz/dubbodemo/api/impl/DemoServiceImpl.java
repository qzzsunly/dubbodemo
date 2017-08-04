package life.qzz.dubbodemo.api.impl;


import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoServiceImpl implements DemoService{
    private Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String getUser(String name) {
        try {
            logger.debug("线程名称：{}",Thread.currentThread().getName());
            logger.debug("服务开始执行");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            logger.error("error", e);
        }
        return "qzz";
    }
}
