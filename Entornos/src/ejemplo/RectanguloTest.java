package ejemplo;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanguloTest {
    @Test
    public void test() {
        rectangulo1 r = new rectangulo1(3, 4);
        assertAll(
                () -> assertEquals(12,r.area()),
                () -> assertEquals(14, r.perimetro())

        );

    }
}
