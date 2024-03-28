package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("PT")
@SpringBootTest
public class Myi18nControllerTestPT {

    @Autowired
    Myi18nController controller;

    @Test
    void testSayHello() {

        System.out.println(controller.sayHello());

    }
}
