package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// @ActiveProfiles("EN")
@SpringBootTest
public class Myi18nControllerTestEN {

    @Autowired
    Myi18nController controller;

    @Test
    void testSayHello() {

        System.out.println(controller.sayHello());

    }
}
