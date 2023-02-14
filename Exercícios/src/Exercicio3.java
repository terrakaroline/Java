import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

       Scanner  leitor = new Scanner(System.in);
       
       System.out.println("Insira a distância total percorrida: ");

       float distancia = leitor.nextFloat();

       System.out.println("Insira a quantidade de combustível gasta: ");
       float combustivel = leitor.nextFloat();

       float consumo = combustivel / distancia;

       System.out.println("O consumo médio do veículo é de " + consumo + "L/km");

       leitor.close();
        
    }
}
