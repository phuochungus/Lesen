package me.phuochungus.Lesen.book_instance;

import jakarta.persistence.*;
import me.phuochungus.Lesen.book.Book;
import me.phuochungus.Lesen.user.User;

@Entity
public class BookInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "issued_to_user_id")
    private User issued_to_user;
}
