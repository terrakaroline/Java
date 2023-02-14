public class Main{
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador(12, 3);

        elevador1.Entrar(2);
        elevador1.Sair(1);
        elevador1.Entrar(20);
        elevador1.Entrar(11);

        elevador1.Sair(12);
        elevador1.Sair(1);
        elevador1.Subir();
        elevador1.Subir();
        elevador1.Subir();
        elevador1.Descer();
        elevador1.Descer();
        elevador1.Descer();
        elevador1.Descer();
        elevador1.Subir();

    }
}