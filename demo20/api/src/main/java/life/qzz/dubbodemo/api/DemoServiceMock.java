package life.qzz.dubbodemo.api;


public class DemoServiceMock  implements DemoService{
    public String sayHello(String name) {
        return "mock 数据";
    }
}
