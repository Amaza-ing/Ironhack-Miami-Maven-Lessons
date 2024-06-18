package com.ironhack.w2.d2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getHarryPotter_noParams_getEqualsBooks() {
        Book expectedBook = new Book(5678, "Harry Potter", "J.K. Rowling", 1997);
        assertEquals(expectedBook, Book.getHarryPotter());
    }
}