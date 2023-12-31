package me.phuochungus.Lesen.book;

import jakarta.validation.Valid;
import me.phuochungus.Lesen.LesenApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping()
    public Book createBook(@Valid @RequestBody Book book) {
        LesenApplication.logger.info("Book: " + book);
        return bookService.createBook(book);
    }
}
