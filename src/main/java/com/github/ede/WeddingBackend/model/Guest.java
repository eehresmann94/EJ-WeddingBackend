package com.github.ede.WeddingBackend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Guest {
    @Id
    @GeneratedValue
    private long guestId;
    @Column
    @NotNull(message = "Guest name cannot be blank")
    private String guestName;
    @NotNull(message = "Please select a food option")
    private String guestFoodChoice;
}
