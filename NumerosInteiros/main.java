import java.util.Scanner;

public class numerosInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: " );
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números pares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Números ímpares entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}


