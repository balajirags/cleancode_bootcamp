package bootcamp.duplication;

public class BookRental {

    private int id;
    private int customerName;

    public BookRental(int id, int customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public int getCustomerName() {
        return customerName;
    }
}
