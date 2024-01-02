package me.phuochungus.Lesen.user;

import jakarta.persistence.*;
import me.phuochungus.Lesen.account.Account;
import me.phuochungus.Lesen.base.Profile;
import me.phuochungus.Lesen.book_instance.BookInstance;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private Profile profile;

    @OneToMany(mappedBy = "issued_to_user")
    private List<BookInstance> issued_book_instances = new ArrayList<>();

    @OneToOne
    @MapsId
    @JoinColumn
    private Account account;
}
