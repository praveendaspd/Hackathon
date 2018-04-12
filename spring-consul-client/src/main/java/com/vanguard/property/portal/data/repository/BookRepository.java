package com.vanguard.property.portal.data.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vanguard.property.portal.data.entity.Book;

/**
 * {@code BookRepository} is a JPA book repository. It servers as an example
 * for springfox-data-rest.
 * <p/>
 *
 * @author Indra Basak
 * @since 12/7/17
 */
@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
}
