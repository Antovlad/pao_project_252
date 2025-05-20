// Req 1: Clasă simplă cu atribute private și metode de acces
public class User {
    private int id;
    private String name;
    private Address address; // Compoziție
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}