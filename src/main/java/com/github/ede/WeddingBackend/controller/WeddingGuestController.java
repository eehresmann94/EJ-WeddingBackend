package com.github.ede.WeddingBackend.controller;

import com.github.ede.WeddingBackend.model.WeddingGuests;
import com.github.ede.WeddingBackend.repositiory.WeddingGuestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/weddingguestrsvp")
@CrossOrigin(origins = "http://localhost:3000")
public class WeddingGuestController {
    @Autowired
    WeddingGuestsRepository weddingGuestsRepository;

    @PostMapping
    public ResponseEntity<WeddingGuests> addGuest(@Valid @RequestBody WeddingGuests guest){
        guest = weddingGuestsRepository.save(guest);
        return ResponseEntity.ok(guest);
    }
}
