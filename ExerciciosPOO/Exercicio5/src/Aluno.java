public class Aluno{
    private int matricula;
    private String nome;
    private float prova1;
    private float prova2;
    private float trab;

    public Aluno(int matricula, String nome, float prova1, float prova2, float trab) {

        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trab = trab;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getProva1() {
        return prova1;
    }
    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }
    public float getProva2() {
        return prova2;
    }
    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }
    public float getTrab() {
        return trab;
    }
    public void setTrab(float trab) {
        this.trab = trab;
    }

    public float Media(){
        return ((getProva1()*2.5f)+ (getProva2()*2.5f) + (getTrab()* 2))/4.5f;
    }

    public float Final(){
        if (Media() < 7) {
            return (10 - Media()); 
        } else {
            return 0;
        }
    }
}