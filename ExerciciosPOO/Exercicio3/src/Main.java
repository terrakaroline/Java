public class Main {
    public static void main(String[] args) {
        
        BombaCombustivel bomba1 = new BombaCombustivel();

        bomba1.setTipoCombustivel("Gasolina aditivada");
        bomba1.alterarValor(5.17f);
        bomba1.alterarQtdCombustivel(3000f);

        bomba1.abastecerPorLitro(10);
        bomba1.abastecerPorValor(51.7f);

        System.out.println(bomba1.getQtdCombustivel()); 
    }
}