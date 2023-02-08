import java.util.Scanner;
public class ExercicioQuinze {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o número: ");
        int numero = leitor.nextInt();

        if(numero > 100 && numero < 200){
            System.out.println("O numero está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200.");
        }
    }
}
