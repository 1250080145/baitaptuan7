package baitaptuan7_bai2;

public class person {
    private String name;
    private String address;

    public person(String name, String address) {
    }

    public void perSon(String name, String address) {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Ten: " + getName() + ", Dia chi: " + getAddress());

    }
}


