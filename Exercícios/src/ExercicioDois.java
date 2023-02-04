import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        try(Scanner leitor = new Scanner(System.in)) {
            System.out.println("Insira o primeiro numero: ");
            int numUm = leitor.nextInt();
            System.out.println("Insira o segundo numero: ");
            int numDois = leitor.nextInt();

            System.out.printf("A soma entre os dois números é: " + (numUm + numDois));
            System.out.println("");
            System.out.printf("A subtração entre os dois números é: " + (numUm - numDois));
            System.out.println("");
            System.out.printf("A multiplicação entre os dois números é: " + (numUm * numDois));
            System.out.println("");
            System.out.printf("A divisão entre os dois números é: " + (numUm / numDois));
            System.out.println("");
            System.out.printf("O resto da divisão entre os dois números é: " + (numUm % numDois));
        }
    }
}
