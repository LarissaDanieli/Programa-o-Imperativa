import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");

        int numero = input.nextInt();
        if (numero < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            int fatorial = 1;
            int i = 1;

            while (i <= numero) {
                fatorial *= i;
                i++;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        }

        input.close();
    }
}
