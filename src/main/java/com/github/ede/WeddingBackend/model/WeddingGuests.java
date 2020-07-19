package com.github.ede.WeddingBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WeddingGuests {
    @Id
    @GeneratedValue
    private long guestId;
    @Column
    @NotNull(message = "Guest name cannot be blank")
    private String guestName;
    @Column
    private String plusOneName;
    @Column
    private int children;
    @Column
    @NotNull(message = "Please select a food option")
    private String guestFoodChoice;
    @Column
    private String plusOneFoodChoice;
    @Column
    private int bedsNeeded;

}