package com.vanguard.property.portal.data.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vanguard.property.portal.data.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
}
