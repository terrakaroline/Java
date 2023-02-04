public class Main{
    public static void main(String[] args) {
        
        int codigoProduto = 8;
        
        switch(codigoProduto){
            case 1:
            System.out.println("Lápis, R$ 1,99");
                break;
            case 2:
                System.out.println("Caderno, R$ 22,80");
                break;
            
            default:
                System.out.println("Produto não encontrado");
        }
    }
}