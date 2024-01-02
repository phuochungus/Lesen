package me.phuochungus.Lesen.base_class;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class SoftDeletable {
    public Date deleted_at;
}
