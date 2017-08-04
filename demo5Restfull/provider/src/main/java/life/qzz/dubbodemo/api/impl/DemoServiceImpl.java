package life.qzz.dubbodemo.api.impl;

import life.qzz.dubbodemo.api.DemoService;
import life.qzz.dubbodemo.api.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
@Path("demo")
public class DemoServiceImpl implements DemoService {
    private static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Path("hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object sayHello(String name) {
        logger.debug("服务调用开始");
        User user = new User();
        user.setAge("10");
        user.setName("qzz");
        return user;
    }
}
