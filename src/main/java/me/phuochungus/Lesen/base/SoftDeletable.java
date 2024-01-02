package me.phuochungus.Lesen.base;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class SoftDeletable {
    public Date deleted_at;
}
