package com.ntnu.library;

import org.springframework.web.bind.annotation.*;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private List<Book> bookList = new ArrayList<Book>();

    public BookController() {
        fillBookListWithTestData();
    }

    /**
     * Fills the list with dummy books.
     */
    public void fillBookListWithTestData() {
        bookList.add(new Book(1, "Den Store Norske Glemmeboka", 2012, 430));
        bookList.add(new Book(2, "IT", 1988, 323));
        bookList.add(new Book(3, "Den Lille Svenske Huskeboka", 2013, 74));
    }

    /**
     * Returns the list of books.
     * @return bookList
     */
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookList;
    }

    /**
     * Returns the book with the matching ID, if it exists.
     * TODO: Currently not working according to postman tests, ensure it works.
     * @param id
     * @return
     */
    @GetMapping("/books/ {id}")
    public Book findBookById(@PathVariable int id) {
        Book foundBook = null;
        boolean bookFound = false;
        int i = 0;

        while(i < bookList.size() || !bookFound) {
            if(bookList.get(i).getId() == id) {
                foundBook = bookList.get(i);
                bookFound = true;
            }
            i++;
        }
        return foundBook;
    }

    /** Adds a book to the list of books.
     * TODO: Currently not working, might be because of duplicate mappings?
     */
    @PostMapping("/books {id}")
    public void updateBook(@PathVariable int id) {
        bookList.add(new Book(id, "beans", 2000, 1));
    }

    /**
     * Deletes the book with the matching ID, should it exist.
     * TODO: Currently not working, maybe due to duplicate and bad mappings?
     * @param id
     */
    @DeleteMapping("/books {id}")
    public void deleteBook(int id) {
       Book bookToDelete = bookList
               .remove(bookList
               .indexOf(bookList
               .stream()
               .filter(book -> book.getId() == id)
               .findFirst()));
    }
}
