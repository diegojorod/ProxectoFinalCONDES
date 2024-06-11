public class Main {

    public static void main(String[] args) {
        Usuario newUsuario = new Usuario("Diego","Jorge Rodríguez",
                "diegojorod@gmail.com","abc123.",
                "722201376", "A Valenzá" );

        CuentaBancaria newCuentaBancaria = new CuentaBancaria("466665841", 1400.00);

        newCuentaBancaria.depositar(1000);

        newCuentaBancaria.consultarSaldo();

    }
}
