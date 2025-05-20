// Req 7: Clasa Main cu apeluri către serviciu
import java.util.List;
public class Main {
    public static void main(String[] args) {
        StoreService service = new StoreService();
        // Exemplu de acțiuni
        service.createUser(1, "Alice");
        service.addProduct(new ElectronicProduct(100, "Laptop", 1500.0, 24));
        Cart cart = new Cart(new User(1, "Alice"));
        Product p = service.findProductById(100);
        service.addToCart(cart, p);
        service.placeOrder(10, new User(1,"Alice"), cart.getItems());
        Report report = service.generateReport("Raport Vânzări");
        System.out.println(report.getTitle() + ": " + report.getContent());
    }
}



