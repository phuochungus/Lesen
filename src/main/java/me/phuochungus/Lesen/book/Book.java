package me.phuochungus.Lesen.book;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import me.phuochungus.Lesen.base.SoftDeletable;
import me.phuochungus.Lesen.book_instance.BookInstance;
import me.phuochungus.Lesen.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book extends SoftDeletable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true)
    @NotBlank(message = "isbn is mandatory")
    private String isbn;

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "book_image_urls", joinColumns = @JoinColumn(name = "book_id"))
    @Column(name = "image_url", nullable = false)
    private List<String> image_urls = new ArrayList<>();

    @NotBlank(message = "title is mandatory")
    @Column(nullable = false)
    private String title;

    @Column()
    private String description;

    @OneToMany(mappedBy = "book")
    private List<BookInstance> bookInstances = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<String> getImage_urls() {
        return image_urls;
    }

    public void setImage_urls(List<String> image_urls) {
        this.image_urls = image_urls;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BookInstance> getBookInstances() {
        return bookInstances;
    }

    public void setBookInstances(List<BookInstance> bookInstances) {
        this.bookInstances = bookInstances;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
