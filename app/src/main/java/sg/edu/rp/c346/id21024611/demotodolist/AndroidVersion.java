package sg.edu.rp.c346.id21024611.demotodolist;

public class AndroidVersion {
    @Override
    public String toString() {
        return "AndroidVersion{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    String name;
    double price;

    public AndroidVersion(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}