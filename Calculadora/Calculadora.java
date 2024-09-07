import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Digite o primeiro número: ");
     int n1 = sc.nextInt();

     System.out.print("Digite o segundo número: ");
     int n2 = sc.nextInt();

     int soma = n1 + n2;
     System.out.println("Soma: " + soma);

     int subtracao = n1 - n2;
     System.out.println("Subtracao: " + subtracao);

     int multiplicacao = n1 * n2;
     System.out.println("Multiplicacao: " + multiplicacao);

     if (n2 != 0) {
         double divisao = (double) n1 / n2;
         System.out.println("Divisao: " + divisao);
     } else {
         System.out.println ("Não é possível dividir por zero");
     }
     sc.close();
    }
}
