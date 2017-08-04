package life.qzz.dubbodemo.api;

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
public interface ValidationService {
    @interface Save{}//与方法同名接口，首字母大写，用于区分验证场景，如：@NotNull(groups = ValidationService.Save.class)，可选
    void save(User user);

    void update(User user);
}
