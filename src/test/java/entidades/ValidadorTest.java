package entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    public void testValidarConObjetoNulo() {
        Validador validador = new Validador();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validador.validarNoNulo(null);
        });
        assertEquals("El objeto no puede ser nulo", exception.getMessage());
    }

    @Test
    public void testValidarConObjetoNoNulo() {
        Validador validador = new Validador();
        assertDoesNotThrow(() -> {
            validador.validarNoNulo("No es nulo");
        });
    }
}
