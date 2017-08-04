package life.qzz.dubbodemo.api.impl;

import life.qzz.dubbodemo.api.User;
import life.qzz.dubbodemo.api.ValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 * 描述：
 * 构建组：大道金服科技部
 * 作者:秦在振
 * 邮箱:qinzaizhen@ddjf.com.cn
 * 日期:2017/7/28
 * 版权：大道金服
 * </pre>
 */
public class ValidationServiceImpl implements ValidationService {
    private Logger logger = LoggerFactory.getLogger(ValidationService.class);
    public void save(User user) {
        logger.debug("save user.{}", user);
    }

    public void update(User user) {

    }
}
