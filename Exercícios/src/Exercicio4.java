import java.util.Scanner;

/*. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o nome do vendedor: ");
        String nome = leitor.next();
        System.out.println("Insira seu salário fixo: ");
        float salariofixo = leitor.nextFloat();
        System.out.println("Insira o valor total das vendas dele em dinheiro: ");
        float totalvendas = leitor.nextFloat();

        float salario = ((totalvendas * 15) / 100) + salariofixo;

        System.out.println("O vendedor " + nome + " tem um salário fixo de R$ " + salariofixo + " e recebeu comissão sobre o valor de " + totalvendas + " sendo seu salário total igual a R$ " + salario);

        leitor.close();

    }
}
