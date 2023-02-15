public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "Mello", 1500.00f);
        Funcionario f2 = new Funcionario("Roberto", "Leivas", 2300.00f);

        System.out.println(f1.SalarioAnual());
        System.out.println(f2.SalarioAnual());

        f1.aumentarSalario(0.1f);
        f2.aumentarSalario(0.1f);

        System.out.println("Salário anual do primeiro empregado após o ajuste: " + f1.SalarioAnual());
        System.out.println("Salário anual do segundo empregado após o ajuste: " + f2.SalarioAnual());
        System.out.println("Salário mensal do primeiro empregado após o ajuste: " + f1.getSalarioMensal());
        System.out.println("Salário mensal do segundo empregado após o ajuste: " +  f2.getSalarioMensal());

    }
}