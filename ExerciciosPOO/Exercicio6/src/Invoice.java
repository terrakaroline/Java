public class Invoice {
    
    private int numItem;
    private String descItem;
    private int quantItem;
    private double precoItem;

    public Invoice(int numItem, String descItem, int quantItem, double precoItem){
        this.setNumItem(numItem);
        this.setDescItem(descItem);
        this.setPrecoItem(precoItem);
        this.setQuantItem(quantItem);
    }


    public int getNumItem() {
        return numItem;
    }
    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }
    public String getDescItem() {
        return descItem;
    }
    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }
    public int getQuantItem() {
        return quantItem;
    }
    public void setQuantItem(int quantItem) {
        if(quantItem < 0){
            this.quantItem = 0;
        } else {
            this.quantItem = quantItem;
        }
    }
    public double getPrecoItem() {
        return precoItem;
    }
    public void setPrecoItem(double precoItem) {
        if(precoItem < 0){
            this.precoItem = 0.0f;
        } else{
            this.precoItem = precoItem;
        }
    }

    public double getInvoiceAmount(){
        return getQuantItem() * getPrecoItem();
    }

}
