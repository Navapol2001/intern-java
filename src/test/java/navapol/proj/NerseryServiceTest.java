package navapol.proj;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class NerseryServiceTest {
    @Test
    public void testx() {
        //Assert.assertTrue(false);
    }
    @Test
    public void testy() throws IOException {
        NerseryService service = new NerseryService();
        service.enter(new ThailandAnimal());
        //System.out.println(new ThailandAnimal());
    }
    @Test
    public void testz() {

    }
}
