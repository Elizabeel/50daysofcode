package src;

/**
 * Representa uma conta bancária.
 *
 * @author Elizabete
 * @version 1.0
 */
public class ContaBancaria {

    /** Taxa fixa cobrada em cada saque */
    public static final double TAXA_SAQUE = 2.50;

    private double saldo;
    protected String titular;
    String numeroConta; // default

    /**
     * Deposita um valor na conta.
     *
     * @param valor valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Realiza um saque considerando a taxa fixa.
     *
     * @param valor valor do saque
     */
    public void sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;

        if (valorTotal <= saldo) {
            saldo -= valorTotal;
        }
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }
}
