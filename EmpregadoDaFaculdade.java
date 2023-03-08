import java.util.Scanner;

public class EmpregadoDaFaculdade {
    private static String nome;
    private static double salario;
    private static int horasAula;

    static double getGastos(double horas){
        double bonus;
        bonus= horas*40;
        return bonus;
    }
     static String getInfo(String nome, Double pagamento, Double bonus){
        double pagamentoFinal = bonus+pagamento;
        return "nome:" + nome + " com salário " + pagamentoFinal;
    }

    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        System.out.println("Digite o tempo trabalhado: ");
        int horasTrabalhadas = scannear.nextInt();
        double valorBonus = getGastos(horasTrabalhadas);
        System.out.println("Foram R$" +valorBonus + " de bônus");
        System.out.println("Digite o salário do empregado:");
        double salarioDoEmpregado = scannear.nextDouble();
        System.out.println(getInfo("Wesley",salarioDoEmpregado, valorBonus));

    }
}
