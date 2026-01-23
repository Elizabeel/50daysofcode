package src;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Elizabete";
        conta.numeroConta = "12345-6";

        conta.depositar(500);
        conta.sacar(100);

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}

