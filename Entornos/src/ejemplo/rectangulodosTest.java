package ejemplo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;
// Comentado temporalmente, puede ser útil más adelante
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RectangulodosTest {
    @BeforeAll
    public static void setUpBeforeAll() {
        // Código de inicialización que se ejecutará una vez antes de todas las pruebas
        System.out.println("Inicialización antes de todas las pruebas");
    }

}
