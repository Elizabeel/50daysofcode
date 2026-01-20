package sintaxe;

public class FolhaPagamento {
  public static void main(String[] args) {

        Double salarioBase = 2500.0;
        String horasExtrasTexto = "10";

        int horasExtras = Integer.parseInt(horasExtrasTexto);

        double salarioFinal = calcularSalarioFinal(salarioBase, horasExtras);

        String salarioFinalTexto = Double.toString(salarioFinal);

        System.out.println("Salário final: R$ " + salarioFinalTexto);
    }

    public static double calcularSalarioFinal(Double salarioBase, int horasExtras) {

        final int VALOR_HORA_EXTRA = 50;

        double valorHorasExtras = horasExtras * VALOR_HORA_EXTRA;

        return salarioBase + valorHorasExtras;
    }
}
