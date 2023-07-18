public class CuentaBancaria {
    private int numeroDeCuenta;
    private int saldo;

    public CuentaBancaria(int numeroDeCuenta, int saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getValorTotal() {
        return saldo;
    }
}
