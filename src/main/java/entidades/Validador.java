package entidades;

public class Validador {
    public void validarNoNulo(Object objeto) {
        if (objeto == null) {
            throw new IllegalArgumentException("El objeto no puede ser nulo");
        }
    }
}