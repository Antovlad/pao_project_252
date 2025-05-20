// Req 1: Clasă simplă cu List
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private User user;
    private List<Product> items = new ArrayList<>(); // Colecție List (poate conține subclase, ex. ElectronicProduct)
    public Cart(User user) { this.user = user; }
    public void addItem(Product p) { items.add(p); }
    public void removeItem(Product p) { items.remove(p); }
    public List<Product> getItems() { return items; }
}