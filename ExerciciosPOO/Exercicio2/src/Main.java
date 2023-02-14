public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente((2001), "Karoline");

        conta1.alterarNome("Ana");
        conta1.depositar(500);
        conta1.sacar(50);
        conta1.depositar(200);
        conta1.sacar(1000);
    }
}