package life.qzz.dubbodemo.api.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import life.qzz.dubbodemo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

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
        logger.debug("服务调用前");
        logger.debug("休息结束");
        logger.debug("服务调用开始");
        return "hello :" + name;
    }

    public Date getDate(Date cur) {
        boolean isProviderSide = RpcContext.getContext().isProviderSide(); // 本端是否为提供端，这里会返回true
        String clientIP = RpcContext.getContext().getRemoteHost(); // 获取调用方IP地址
        String application = RpcContext.getContext().getUrl().getParameter("application"); // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        logger.debug("是否提供者：{}",isProviderSide);
        logger.debug("客户端IP：{}",clientIP);
        logger.debug("应用名：{}",application);
        return cur;
    }
}
