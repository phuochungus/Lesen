package me.phuochungus.Lesen.book;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import me.phuochungus.Lesen.helper.SoftDeletable;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book extends SoftDeletable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(unique = true)
    @NotBlank(message = "International Standard Book Number is mandatory")
    private String international_standard_book_number;

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "book_image_urls", joinColumns = @JoinColumn(name = "book_id"))
    @Column(name = "image_urls", nullable = false)
    private List<String> image_urls = new ArrayList<>();

    @NotBlank(message = "Title is mandatory")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Description is mandatory")
    @Column()
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInternational_standard_book_number() {
        return international_standard_book_number;
    }

    public void setInternational_standard_book_number(String international_standard_book_number) {
        this.international_standard_book_number = international_standard_book_number;
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
}
