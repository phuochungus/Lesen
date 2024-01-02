package me.phuochungus.Lesen.book_instance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
