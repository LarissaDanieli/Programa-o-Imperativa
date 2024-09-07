import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso:");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura:");
        double altura = input.nextDouble();
        double IMC = peso / (altura * altura);
        System.out.println("IMC: " + IMC);
        if (IMC < 18.5) {
            System.out.print("Você está abaixo do peso!");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.print("Você está com o peso normal!");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.print("Você está com sobrepeso!.");
        } else if (IMC >= 30 && IMC < 35) {
            System.out.print("Você está com obesidade!");
        }
        input.close();
    }
}
