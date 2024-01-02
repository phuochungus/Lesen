package me.phuochungus.Lesen.book;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import me.phuochungus.Lesen.base.SoftDeletable;
import me.phuochungus.Lesen.book_instance.BookInstance;
import me.phuochungus.Lesen.publisher.Publisher;

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
    private List<BookInstance> book_instances = new ArrayList<>();

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

    public List<BookInstance> getBook_instances() {
        return book_instances;
    }

    public void setBook_instances(List<BookInstance> bookInstances) {
        this.book_instances = bookInstances;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
