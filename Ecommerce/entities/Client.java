package Ecommerce.entities;

public class Client {

    private String name;
    private String contact;
    private String address;
    private final String id;

    public Client(String name, String contact, String address, String id) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return name + " - " + contact + " - " + address;
    }
}
