package life.qzz.dubbodemo.listener.impl;

import life.qzz.dubbodemo.api.User;
import life.qzz.dubbodemo.listener.Notify;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotifyImpl implements Notify {
    private Logger logger  = LoggerFactory.getLogger(NotifyImpl.class);

    public void onInvoke() {

    }/*public void onInvoke(RpcContext context) {
        if (context != null){
            logger.debug("应用名：{}",RpcContext.getContext().getUrl().getParameter("application"));
            logger.debug("方法名：{}",RpcContext.getContext().getMethodName());
        }
    }*/

    public void onReturn(User user, Object[] args ) {
        logger.debug("on return: {}",user);
        logger.debug("on return args: {}",args);
    }

    public void onThrown(Throwable e) {
        logger.debug("on thrown: {}",e);
    }
}
