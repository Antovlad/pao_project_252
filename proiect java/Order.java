// Req 1 și Req 3: Clasă simplă și Comparable pentru sortare
import java.time.LocalDate;
import java.util.List;
public class Order implements Comparable<Order> {
    private int id;
    private User user;
    private List<Product> items;
    private LocalDate date;
    public Order(int id, User user, List<Product> items) {
        this.id = id;
        this.user = user;
        this.items = items;
        this.date = LocalDate.now();
    }
    public LocalDate getDate() { return date; }
    @Override
    public int compareTo(Order other) {
        return this.date.compareTo(other.date);
    }
}