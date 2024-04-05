public class CuentaBancaria {
    //atributos
    private String accountNumber;

    private double balance;


    //constructor

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


    // Método para depositar dinero en la cuenta
    public void depositar(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        } else {
            balance += amount;
            System.out.println("Se depositaron " + amount + " unidades monetarias en la cuenta.");
        }
    }

    // Método para retirar dinero de la cuenta
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


    // Método para consultar el saldo actual de la cuenta
    public double consultarSaldo() {
        return balance;
    }


}
