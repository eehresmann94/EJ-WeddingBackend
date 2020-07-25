package com.github.ede.WeddingBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WeddingGuests {
    @Id
    @GeneratedValue
    private int rsvpId;
    @OneToMany
    private List<Guest> guests;
    @Column
    private int children;
    @Column
    private int bedsNeeded;

}