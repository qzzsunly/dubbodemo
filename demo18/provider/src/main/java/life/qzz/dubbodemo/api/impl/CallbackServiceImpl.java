package life.qzz.dubbodemo.api.impl;

import life.qzz.dubbodemo.api.CallbackListener;
import life.qzz.dubbodemo.api.CallbackService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
public class CallbackServiceImpl implements CallbackService {
    private Map<String, CallbackListener> listeners = new ConcurrentHashMap<>();

    public CallbackServiceImpl() {
        Thread thread = new Thread(() -> {
            while (true) {

                listeners.forEach((key, listener) -> {
                    try {
                        listener.changed(getChanged(key));
                    } catch (Exception e) {
                        listeners.remove(key);
                    }
                });

                try {
                    Thread.sleep(5000); // 定时触发变更通知
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public void addListener(String key, CallbackListener listener) {
        listeners.put(key, listener);
        listener.changed(getChanged(key));
    }

    private String getChanged(String key) {
        return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
