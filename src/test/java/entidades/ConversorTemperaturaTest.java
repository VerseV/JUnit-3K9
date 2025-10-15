package entidades;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    public void testConversionDeCeroGrados() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(32.0, conversor.celsiusAFahrenheit(0));
    }

    @Test
    public void testConversionDeCienGrados() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(212.0, conversor.celsiusAFahrenheit(100));
    }

    @Test
    public void testConversionDeTemperaturaNegativa() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(-4.0, conversor.celsiusAFahrenheit(-20));
    }
}