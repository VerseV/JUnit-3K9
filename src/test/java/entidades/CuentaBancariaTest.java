package entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    public void testDepositar() {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        cuenta.depositar(50.0);
        assertEquals(150.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirarConFondosSuficientes() {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        cuenta.retirar(50.0);
        assertEquals(50.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirarSinFondosSuficientes() {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(150.0);
        });
    }
}