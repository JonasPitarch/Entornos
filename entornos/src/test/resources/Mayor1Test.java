import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mayor1Test {
    @Test
    void mayor() {
        int mayorUltimo = Mayor1.Mayor(3, 4);
        assertEquals(4, mayorUltimo);
        int mayorPrimero = Mayor1.Mayor(4, 3);
        assertEquals(4, mayorPrimero);
        int mayorIguales = Mayor1.Mayor(4, 4);
        assertEquals(4, mayorIguales);
        int mayorNegativos = Mayor1.Mayor(-3, -4);
        assertEquals(-3, mayorNegativos);
    }
    @Test
    void esMayor() {
        assertTrue(Mayor1.EsMayor(4, 3));
        assertTrue(Mayor1.EsMayor(-3, -4));
        assertFalse(Mayor1.EsMayor(3, 4));
        assertFalse(Mayor1.EsMayor(4, 4));
        assertFalse(Mayor1.EsMayor(-4, -3));
    }
}