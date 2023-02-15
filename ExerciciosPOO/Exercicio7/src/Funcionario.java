public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salarioMensal;

    public Funcionario(String nome, String sobrenome, float salarioMensal) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalarioMensal(salarioMensal);

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public float getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0.0f;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public float SalarioAnual() {
        return (getSalarioMensal() * 12);
    }
    public float aumentarSalario(float porcentagem){
        setSalarioMensal(((getSalarioMensal() * porcentagem) + getSalarioMensal()));
        return getSalarioMensal();
    }

}
