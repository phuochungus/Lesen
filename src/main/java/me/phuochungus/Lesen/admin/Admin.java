package me.phuochungus.Lesen.admin;

import jakarta.persistence.*;
import me.phuochungus.Lesen.account.Account;
import me.phuochungus.Lesen.base_class.Profile;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private Profile profile;


    @OneToOne
    @MapsId
    @JoinColumn
    private Account account;
}
