import java.util.Scanner;

/*  Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de 
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius; */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a temperatura em graus celsius: ");
        float C = leitor.nextFloat();

        float F = (9*C+160) / 5;

        System.out.println("A temperatura em fahrenheit é igual a " + F);

        leitor.close();
    }

}
