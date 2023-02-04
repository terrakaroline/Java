import java.util.Scanner;

public class ExercicioUm{
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Insira o primeiro numero: ");
            int numUm = leitor.nextInt();
            System.out.println("Insira o segundo numero: ");
            int numDois = leitor.nextInt();

            int soma = numUm + numDois;

            System.out.printf("O resultado foi: " + soma);
        }
    }
}