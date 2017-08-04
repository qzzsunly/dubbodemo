package life.qzz;

import life.qzz.impl.TestRegistryService;
//@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello" + name;
    }
}