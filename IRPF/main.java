import java.util.Scanner;

public class IRPF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu salário bruto: R$ ");
        double salarioBruto = input.nextDouble();

        double aliquota= 0.0;
        double deducao = 0.0;

        if (salarioBruto <=2259.20) {
            aliquota = 0.0;
            deducao = 0.0;

        } else if (salarioBruto <=2826.65) {
            aliquota = 0.075;
            deducao = 169.44;

        } else if (salarioBruto <=3751.05) {
            aliquota = 0.15;
            deducao = 381.44;

        } else if (salarioBruto <= 4664.68){
            aliquota = 0.225;
            deducao = 662.77;

        } else {
            aliquota = 0.275;
            deducao = 896.00;
        }
        double impostodeRenda = (salarioBruto * aliquota) - deducao;

        double salarioLiquido = salarioBruto - impostodeRenda;

        System.out.printf("Imposto de Renda: R$ %.2f%n", impostodeRenda);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

input.close();
        }
}

