import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        Motorista m = new Motorista();
        v.setNome("Karoline");
        v.setSalario(1000.0f);
        v.setCpf("0392093040");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        System.out.println("O salário do vendedor foi de: " + v.calcularSalario());

        m.setNome("Daniel");
    }
}
