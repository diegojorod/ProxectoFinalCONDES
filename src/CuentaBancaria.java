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
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Método para depositar dinero en la cuenta
    public void depositar(double ammount) {
        if (ammount > 0) {
            balance += ammount;
            System.out.println("Se depositaron " + ammount + " unidades monetarias en la cuenta.");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }
    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= balance) {
                balance -= cantidad;
                System.out.println("Se retiraron " + cantidad + " unidades monetarias de la cuenta.");
            } else {
                System.out.println("Saldo insuficiente para realizar la transacción.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    // Método para consultar el saldo actual de la cuenta
    public double consultarSaldo() {
        return balance;
    }


}
