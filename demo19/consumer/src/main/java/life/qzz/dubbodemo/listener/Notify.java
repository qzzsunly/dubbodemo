package life.qzz.dubbodemo.listener;


import life.qzz.dubbodemo.api.User;

public interface Notify {
    void onInvoke();
    void onReturn (User user, Object[] args );
    void onThrown (Throwable e);
}
