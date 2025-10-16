package entidades;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {

        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        //Error intencional: en vez de sumarle el monto al saldo actual, se lo resto
        saldo -= monto;

        /*
        Este seria el codigo para depositar dinero siempre que el monto a depositar sea mayor a cero
         if (monto > 0) {
            this.saldo += monto; //Al saldo que tiene el cliente se le suma el monto
        }
        */
    }

    public void retirar(double monto) {
        //Error intencional: coloco metodo para retirar dinero pero no verifico si lo que quiere retirar es mayor a su saldo
        throw new IllegalArgumentException("Fondos insuficientes");

        /*
        Este seria el codigo para retirar dinero, si el monto a retirar es mayor que el saldo actual tira error
        if (monto > this.saldo) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        this.saldo -= monto; // Si el monto es menor al saldo actual se retira y se RESTA del saldo actual

         */
    }

    public double getSaldo() {

        return saldo;
    }
}
