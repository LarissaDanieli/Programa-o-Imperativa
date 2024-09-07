import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu salário bruto:R$ ");
        double sal = input.nextDouble();

        double contribuição = 0.0;

        if (sal <= 1320.00) {
            contribuição = sal * 0.075;
        } else if (sal <=2640.00) {
            contribuição = (1320.00 * 0.075) + ((sal- 1320.00) * 0.09);
        } else if (sal <= 3960.00) {
            contribuição = (1320.00 * 0.075) + (1320.00 * 0.09) + ((sal - 2640.00) * 0.12);
        } else {
            contribuição = (1320.00 * 0.075) + (1320.00 * 0.09) + (1320.00 * 0.12) + ((sal - 3960.00) * 0.14);
        }
        double salarioLiquido = sal - contribuição;

        System.out.printf("Valor da contribuição ao INSS: R$ %.2f%n", contribuição);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        input.close();

    }
}

