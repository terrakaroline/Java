public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private float saldo = 0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
    }

    public void alterarNome(String nome) {
        setNomeCorrentista(nome);
        System.out.println("O nome atual da conta foi alterado com sucesso para " + getNomeCorrentista());
    }

    public void depositar(float deposito) {
        this.setSaldo(this.saldo + deposito);
        System.out.println("Você possui agora o valor de " + getSaldo() + " em conta");
    }

    public void sacar(float saque) {
        if(getSaldo() >= saque){
            setSaldo(this.saldo - saque);
            System.out.println("Saldo atual de " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente, você possui  " + getSaldo() + " em conta");
        }
    }
}
