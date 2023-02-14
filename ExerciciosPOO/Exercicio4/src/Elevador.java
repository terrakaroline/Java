public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadeElevador;

    private int pessoasAtualmente;


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasAtualmente() {
        return pessoasAtualmente;
    }

    public void setPessoasAtualmente(int pessoasAtualmente) {
        this.pessoasAtualmente = pessoasAtualmente;
    }

    

    public Elevador(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    public void Entrar(int qtdpessoas){
        if (getCapacidadeElevador() >= (getPessoasAtualmente() + qtdpessoas)){
            setPessoasAtualmente(getPessoasAtualmente() + qtdpessoas);
            System.out.println("Mais alguém entrou no elevador, existem " + getPessoasAtualmente() + " lá dentro");
        } else {
            System.out.println("O elevador está lotado");;
        }
    }

    public void Sair(int qtdpessoas){
        if ((getPessoasAtualmente() - qtdpessoas) >= 0) {
            setPessoasAtualmente(getPessoasAtualmente() - qtdpessoas);
            System.out.println("Alguém saiu do elevador, agora existem " + getPessoasAtualmente() + " lá dentro");
        } else {
            System.out.println("Não existe pessoas o suficiente para sair do elevador.");
        }
    }

    public void Subir(){
        if (getAndarAtual() < getTotalAndares()){
            setAndarAtual(getAndarAtual() + 1);
            System.out.println("O elevador está atualmente no andar " + getAndarAtual());
        } else {
            System.out.println("O elevador está no limite de andares");
        }
    }

    public void Descer(){
        if (getAndarAtual() != 0){
            setAndarAtual(getAndarAtual() -1);
            System.out.println("O elevador está atualmente no andar " + getAndarAtual());
        } else {
            System.out.println("O elevador está no térreo");
        }
    }




}
