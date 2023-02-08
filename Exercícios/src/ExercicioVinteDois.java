import java.util.Scanner;
public class ExercicioVinteDois {
    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;

        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 40; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();
            System.out.println("Digite o preço de custo: ");
            precoCusto = leitor.nextFloat();
            System.out.println("Digite o preço de venda: ");
            precoVenda = leitor.nextFloat();


        }
    }
}
