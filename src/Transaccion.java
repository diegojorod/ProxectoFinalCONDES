import java.time.LocalDateTime;

public class Transaccion {
    // Atributos
    private LocalDateTime date;
    private String typeTransaction;
    private double ammount;
    private String category;

    // Constructor
    public Transaccion(LocalDateTime date, String typeTransaction, double ammount) {
        this.date = date;
        this.typeTransaction = typeTransaction;
        this.ammount = ammount;
    }

    // Getters y setters


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    // Método para asignar una categoría a la transacción
    public void setCategory(String category) {
        this.category = category;
    }

    // Método para obtener la categoría de la transacción
    public String getCategory() {
        return category;
    }

    // Método para calcular el saldo
    public double calculateBalance(double currentBalance) {
        if (typeTransaction.equals("Ingreso")) {
            return currentBalance + ammount;
        } else if (typeTransaction.equals("Gasto")) {
            return currentBalance - ammount;
        } else {
            return currentBalance;
        }
    }
    // Método para validar la cantidad de la transacción
    public boolean isValidTransactionAmount() {
        return ammount >= 0; 
    }
}

