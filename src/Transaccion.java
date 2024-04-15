import java.time.LocalDateTime;

public class Transaccion {
    // Atributos
    private LocalDateTime date;
    private String typeTransaction;
    private double ammount;
    private String category;

    /**
     * Constructor de la clase Transaccion.
     * @param date La fecha de la transacción.
     * @param typeTransaction El tipo de transacción (ingreso o gasto).
     * @param ammount El monto de la transacción.
     */
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

    /**
     * Método para asignar una categoría a la transacción.
     * @param category La categoría a asignar a la transacción.
     */
    public void setCategory(String category) {
        this.category = category;
    }


    /**
     * Método para obtener la categoría de la transacción.
     * @return La categoría de la transacción.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Método para calcular el saldo resultante después de la transacción.
     * @param currentBalance El saldo actual antes de la transacción.
     * @param tipoTransaccion El tipo de transacción (ingreso o gasto).
     * @param amount El monto de la transacción.
     * @return El saldo resultante después de la transacción.
     */
    public double calculateBalance(double currentBalance, TipoTransaccion tipoTransaccion, double amount) {
        if (TipoTransaccion.INGRESO == tipoTransaccion) {
            return currentBalance + amount;
        } else if (tipoTransaccion == TipoTransaccion.GASTO) {
            return currentBalance - amount;
        } else {
            return currentBalance;
        }
    }


    /**
     * Método para validar si la cantidad de la transacción es válida (mayor o igual a cero).
     * @return true si la cantidad de la transacción es válida, false en caso contrario.
     */
    public boolean isValidTransactionAmount() {
        return ammount >= 0;
    }
}

