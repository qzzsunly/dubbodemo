package life.qzz.dubbodemo.api;


public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
}
