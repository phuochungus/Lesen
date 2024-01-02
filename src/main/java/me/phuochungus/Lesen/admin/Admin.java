package me.phuochungus.Lesen.admin;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import me.phuochungus.Lesen.account.Account;
import me.phuochungus.Lesen.base.Profile;

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
