package com.vanguard.property.portal.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vanguard.property.portal.config.CassandraProperties;
import com.vanguard.property.portal.data.entity.Book;
import com.vanguard.property.portal.model.BookRequest;
import com.vanguard.property.portal.service.BookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BookController {

    private BookService service;
    
    @Autowired
    private CassandraProperties cassandra;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public Book create(@RequestBody BookRequest request) {
        return service.create(request);
    }

    @RequestMapping(method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE}, value = "/books/{id}")
    public Book read(@PathVariable("id") UUID id) {
        return service.read(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE}, value = "/cassandra")
    public CassandraProperties cassandra() {
        return cassandra;
    }
    
    
}
