public class Pessoa {
    //atributos
    private float peso;
    private float altura;

    //MÉTODO CONSTRUTOR, é usado para passar coisas que iniciarão com o objeto


    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
        
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }

    //MÉTODOS ACESSORES
    public void setPeso(float peso){
        this.peso = peso;
    } // muda o peso
    public float getPeso(){
        return peso;
    } //mostra o valor de peso

    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
}
