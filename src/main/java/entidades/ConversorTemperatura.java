package entidades;

public class ConversorTemperatura {
    public double celsiusAFahrenheit(double celsius) {
        //Error intencional: en vez de multiplicar por 9/5= 1,8 vamos a redondear a 2

        return (celsius * 2) + 32;

        //Este seria el calculo correcto para pasar de celius a Fahrenheit
        // return (celsius * 1.8) + 32;
    }
}
