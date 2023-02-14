public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorLitro;
    private float qtdCombustivel;
    public String 
    
    getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public float getValorLitro() {
        return valorLitro;
    }
    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
    public float getQtdCombustivel() {
        return qtdCombustivel;
    }
    public void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public void abastecerPorValor(float valor){
        System.out.println("Foram abastecidos " + (valor / valorLitro) + " litros");
        setQtdCombustivel(getQtdCombustivel() - (valor/valorLitro));
    }

    public void abastecerPorLitro(float litro) {
        System.out.println("A gasolina custou R$ " + (litro * valorLitro));
        setQtdCombustivel(getQtdCombustivel() - litro);
    }

    public void alterarValor(float valor) {
        setValorLitro(valor);
    }
    public void alterarCombustivel(String combustivel) {
        setTipoCombustivel(combustivel);
    }
    public void alterarQtdCombustivel(float valor) {
        setQtdCombustivel(valor);
    }
}
