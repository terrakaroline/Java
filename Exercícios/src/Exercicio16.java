import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.print("Insira a primeira nota do aluno: ");
        int nota1 = leitor.nextInt();
        System.out.print("Insira a segunda nota do aluno: ");
        int nota2 = leitor.nextInt();

        System.out.print("Insira a terceira nota do aluno: ");
        int nota3 = leitor.nextInt();
        int total = (nota1 + nota2 + nota3) / 3;

        if(total >= 7) {
            System.out.println("O aluno "+ nome + " foi aprovado");
        } else if(6.9 >= total && 5.1 <= total){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        leitor.close();
    }
}
