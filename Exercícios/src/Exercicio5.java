 /* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética); */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float media;
        float total = 0;
        System.out.println("Insira o nome do(a) aluno(a): ");
        String nome = leitor.next();

        for(int i = 0; i < 3; i++) {
            System.out.println("Insira a " + (i+1) +"º nota");
            total = total + leitor.nextInt();
        }

        media = total / 3;

        System.out.println("O(a) aluno(a) " + nome + " teve a média de " + media);
        leitor.close();


    }
   
    
}
