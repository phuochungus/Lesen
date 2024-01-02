package me.phuochungus.Lesen.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import me.phuochungus.Lesen.admin.Admin;
import me.phuochungus.Lesen.user.User;

@Entity
public class Account {
    @Id
    private long id;

    @Override
    public String toString() {
        return "Account [id=" + id + ", email=" + email + ", password=" + password + ", admin=" + admin + ", user="
                + user + "]";
    }

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
