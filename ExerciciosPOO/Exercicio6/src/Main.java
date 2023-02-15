public class Main {
    public static void main(String[] args) {

        Invoice item = new Invoice(222, "Mouse RGB", -5, -60.00);

        System.out.println("O produto " + item.getDescItem() + " rendeu o seguinte lucro: " + item.getInvoiceAmount());

        System.out.println(item.getPrecoItem());
        System.out.println(item.getQuantItem());
        item.setPrecoItem(8);
        item.setQuantItem(2);

        System.out.println(item.getPrecoItem());
        System.out.println(item.getQuantItem());
    }
}