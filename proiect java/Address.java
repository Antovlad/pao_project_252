// Req 1: Clasă simplă cu atribute private și metode de acces
public class Address {
    private String street;
    private String city;
    private String zip;
    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
}