package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

public class MyControllerTest {

    @Test
    void testSayHello() {

        MyController controller = new MyController();

        System.out.println(controller.sayHello());

    }
}
