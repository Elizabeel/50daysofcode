package sintaxe;

public class SimuladorDesconto {
    public static void main(String[] args) {

        double valorCompra = 1200.0;
        int quantidadeParcelas = 3;

        boolean valorAlto = valorCompra >= 1000;
        boolean poucasParcelas = quantidadeParcelas <= 3;

        double desconto = (valorAlto && poucasParcelas) ? 0.10 : 0.0;

        valorCompra -= valorCompra * desconto;

        System.out.println("Valor final da compra: R$ " + valorCompra);
    }
}
