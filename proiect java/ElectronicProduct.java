// Req 5: Moștenire
public class ElectronicProduct extends Product {
    private int warrantyMonths;
    public ElectronicProduct(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warrantyMonths = warranty;
    }
    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }
}