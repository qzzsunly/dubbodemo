package life.qzz.dubbodemo.api.impl;


import life.qzz.dubbodemo.api.DemoService;
import life.qzz.dubbodemo.api.User;

public class DemoServiceImpl implements DemoService{
    public User getUser(String name) {
        return new User("qzz",25);
    }
}
