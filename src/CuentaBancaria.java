public class CuentaBancaria {
    //atributos
    private String accountNumber;

    private double balance;



    /**
     * Constructor de la clase CuentaBancaria.
     * @param accountNumber El número de cuenta de la cuenta bancaria.
     * @param balance El saldo inicial de la cuenta bancaria.
     */

    public CuentaBancaria(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    //getters y setters


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("El número de cuenta no puede ser nulo");
        }else if (accountNumber.length() < 8) { // Por ejemplo, establecer una longitud mínima de 8 caracteres
            throw new IllegalArgumentException("La longitud mínima del número de cuenta es de 8 caracteres.");
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Método para depositar dinero en la cuenta.
     * @param amount La cantidad a depositar en la cuenta.
     * @throws IllegalArgumentException Si la cantidad a depositar es menor o igual a cero.
     */
    public void depositar(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        } else {
            balance += amount;
            System.out.println("Se depositaron " + amount + " unidades monetarias en la cuenta.");
        }
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws IllegalArgumentException Si la cantidad a retirar es menor o igual a cero, o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor que cero.");
        }

        if (cantidad > balance) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar la transacción.");
        }

        balance -= cantidad;
        System.out.println("Se retiraron " + cantidad + " unidades monetarias de la cuenta.");
    }


    /**
     * Método para consultar el saldo actual de la cuenta.
     * @return El saldo actual de la cuenta bancaria.
     */
    public double consultarSaldo() {
        return balance;
    }


}
