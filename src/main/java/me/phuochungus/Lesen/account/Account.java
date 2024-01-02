package me.phuochungus.Lesen.account;

import jakarta.persistence.*;
import me.phuochungus.Lesen.admin.Admin;
import me.phuochungus.Lesen.user.User;

@Entity
public class Account {

    @Id
    private long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToOne(mappedBy = "account")
    @PrimaryKeyJoinColumn
    private Admin admin;

    @OneToOne(mappedBy = "account")
    @PrimaryKeyJoinColumn
    private User user;
}
