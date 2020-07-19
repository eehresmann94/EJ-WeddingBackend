package com.github.ede.WeddingBackend.repositiory;

import com.github.ede.WeddingBackend.model.WeddingGuests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeddingGuestsRepository extends JpaRepository<WeddingGuests,Long> {
}