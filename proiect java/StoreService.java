// Req 6: Clasă serviciu cu colecții și array
import java.util.*;
public class StoreService {
    private List<User> users = new ArrayList<>(); // Colecție List
    private Map<Integer, Product> products = new HashMap<>(); // Colecție Map (stochează Product și subclase, ex. ElectronicProduct)
    private Set<Order> orders = new TreeSet<>(); // Colecție sortată
    private Category[] categories = new Category[5]; // Array uni
    private String[][] stats = new String[5][2]; // Array bidimensional

    public void createUser(int id, String name) { users.add(new User(id, name)); }
    public void deleteUser(int id) { users.removeIf(u -> u.getId() == id); }
    public void updateUser(int id, String newName) {
        for(User u : users) if(u.getId()==id) u.setName(newName);
    }
    public List<User> listUsers() { return users; }

    public void addProduct(Product p) { products.put(p.getId(), p); }
    public void removeProduct(int id) { products.remove(id); }
    public Product findProductById(int id) { return products.get(id); }

    public void addToCart(Cart cart, Product p) { cart.addItem(p); }
    public void placeOrder(int id, User user, List<Product> items) {
        orders.add(new Order(id, user, items));
    }
    public Set<Order> listOrders() { return orders; }

    public Report generateReport(String title) { return new Report(title, "Raport generat"); }
}