package bootcamp.duplication;

import java.util.List;

public class BookRentals {

    List<BookRental> bookRental;

    public BookRentals(List<BookRental> bookRental) {
        this.bookRental = bookRental;
    }

    public String getCustomerName(int rentalId){
        for (BookRental rental : bookRental){
            if(rental.getId() == rentalId){
                rental.getCustomerName();
            }
        }
        return "";
    }

    public void deleteRental(int rentalId) throws Exception {
        for (BookRental rental : bookRental){
            if(rental.getId() == rentalId){
                    bookRental.remove(rental);
            }
        }
       throw new Exception("no rental");
    }
}
