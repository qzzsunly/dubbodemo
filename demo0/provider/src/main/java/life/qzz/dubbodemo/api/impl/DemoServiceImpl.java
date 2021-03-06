package life.qzz.dubbodemo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import life.qzz.dubbodemo.api.DemoService;

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
@Service(version = "1.0")
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "hello :" + name;
    }
}
