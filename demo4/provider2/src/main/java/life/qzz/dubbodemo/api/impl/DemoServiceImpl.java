package life.qzz.dubbodemo.api.impl;

import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class DemoServiceImpl implements DemoService {
    private static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
    public String sayHello(String name) {
        logger.debug("调用Provider2的服务");
        logger.debug("休息20秒");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.debug("休息结束");
        return "hello :" + name;
    }
}