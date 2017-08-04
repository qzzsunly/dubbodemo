package life.qzz.dubbodemo.controller;

import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * 描述：
 * 构建组：大道金服科技部
 * 作者:秦在振
 * 邮箱:qinzaizhen@ddjf.com.cn
 * 日期:2017/7/26
 * 版权：大道金服
 * </pre>
 */
@Component
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);
    //    @Reference(check = false)
    @Autowired
    private DemoService demoService;

    public void hello(String name) {
        logger.debug("服务返回结果：{}" , demoService.sayHello(name));

    }

}
