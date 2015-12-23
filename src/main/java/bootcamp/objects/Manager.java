package bootcamp.objects;

import java.awt.print.Book;
import java.util.ArrayList;

public class Manager {

    Library library;

    public Manager(Library library) {
        this.library = new Library(new ArrayList<Book>());
    }

    //oops. If the datastructure on library changes, the whole thing changes
    public void addBookToLibrary(Book book) {
        library.getBooks().add(book);
    }
}
