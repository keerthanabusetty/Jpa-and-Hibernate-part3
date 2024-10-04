package com.example.goodreads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import com.example.goodreads.model.Book;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @Column(name = "authorid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Column(name = "authorname")
    private String authorName;
    @ManyToMany(mappedBy = "authors")
    @JsonIgnoreProperties("authors")
    private List<Book> books = new ArrayList<>();

    public Author() {

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Author(int authorid, String authorName) {
        this.authorId = authorid;
        this.authorName = authorName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}