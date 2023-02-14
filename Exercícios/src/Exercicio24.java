import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char desejaContinuar = 'S';

        while(desejaContinuar == 'S' || desejaContinuar == 's'){

            System.out.println("Digite o número: ");
            int num = leitor.nextInt();

            if(num > 0){
                System.out.println("Número positivo");
            } else if(num == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Negativo");
            }
            System.out.println("Deseja continuar");
            desejaContinuar = leitor.next().charAt(0);
        }

        leitor.close();

    }
}
