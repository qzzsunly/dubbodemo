package life.qzz.dubbodemo.action;

import com.alibaba.dubbo.config.annotation.Reference;
import life.qzz.dubbodemo.api.DemoService;
import org.springframework.stereotype.Component;

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
@Component
public class DemoController {
    @Reference(version = "1.0")
    private DemoService demoService;
    public void sayHello(String name){
        System.out.println(demoService.sayHello(name));
    }
}
