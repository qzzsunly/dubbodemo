package life.qzz.dubbodemo.api;

/**
 * <pre>
 * 描述：
 * 构建组：大道金服科技部
 * 作者:秦在振
 * 邮箱:qinzaizhen@ddjf.com.cn
 * 日期:2017/7/31
 * 版权：大道金服
 * </pre>
 */
public interface CallbackService {
    void addListener(String key, CallbackListener listener);
}
