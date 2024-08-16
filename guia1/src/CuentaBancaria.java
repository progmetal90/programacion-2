public class CuentaBancaria {
    private int id;
    private final String titular;
    private double balance;

    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    public CuentaBancaria(String nombreTitular, double balanceInicial) {
        id = (int)(Math.random() * 1000000);
        titular = nombreTitular;
        balance = balanceInicial;
    }

    public double depositar(double monto) {
        balance += monto;

        return balance;
    }

    public double debitar(double monto) {
        if(monto > balance) {
            System.out.println("La cuenta no posee balance suficiente para completar la operacion.");
        }
        else {
            balance -= monto;
        }

        return balance;
    }

    public void mostrar() {
        System.out.printf("Cuenta #%d, titular: %s, balance: %.2f.\n", id, titular, balance);
    }
}
