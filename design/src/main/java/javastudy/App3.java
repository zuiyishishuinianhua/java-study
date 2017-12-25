package javastudy;

import javax.annotation.Resource;

public class App3 {
    @Resource
    private App app = null;

    public App3(App app) {
        this.app = app;
    }

    public void test() {

        app.test2();
    }

    public static void main(String[] args) {
        App3 app3 = new App3(new App());
        app3.test();




    }
}
