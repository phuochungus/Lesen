package me.phuochungus.Lesen.user;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import me.phuochungus.Lesen.account.Account;
import me.phuochungus.Lesen.base.Profile;
import me.phuochungus.Lesen.book_instance.BookInstance;

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
