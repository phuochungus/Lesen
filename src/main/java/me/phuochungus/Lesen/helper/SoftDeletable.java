package me.phuochungus.Lesen.helper;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class SoftDeletable {
    public Date deleted_at;
}
