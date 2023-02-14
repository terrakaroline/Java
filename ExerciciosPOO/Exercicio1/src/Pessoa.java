import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private float altura;
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + " Data de nascimento " + dataNascimento + " altura: " + altura);
    }
}
