import java.util.Scanner;
public class EstruturaWhile {
    public static void main(String[] args) {

        int totalAlunos = 10;

        Scanner leitor = new Scanner(System.in);

        while (totalAlunos > 0){
            System.out.println("Insira o nome: ");
            String nomeAluno = leitor.nextLine();
            System.out.println("Insira a nota: ");
            String idadeAlunostr = leitor.nextLine();

            int idadeAluno = Integer.parseInt(idadeAlunostr);

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }
    }
}
