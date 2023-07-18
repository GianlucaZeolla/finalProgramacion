public class CuentaBacancariaTest {
    public static void main(String[] args) {
        CuentaBancaria[] cuentaBancarias = {
                new CuentaBancaria(1, 10000),
                new CuentaBancaria(2, 50000),
        };
        for (CuentaBancaria cuentaBancaria: cuentaBancarias) {
            System.out.println("numero de cuenta" + cuentaBancaria.getNumeroDeCuenta());
            System.out.println("valor total: $" + cuentaBancaria.getValorTotal());
            System.out.println();




        }
    }
}
