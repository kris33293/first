package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Nested
    @DisplayName("Test for ListBookWithCondition")
    class TestListBookWithCondition {


        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                    .thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {

            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given

            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);


            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("Test for listBooksInHandsOf")
    class TestlistBooksInHandsOf {

        @Test
        void testListBooksInHandsOfZero() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> borrowed0Books = new ArrayList<Book>();
            LibraryUser user = new LibraryUser("First", "Last", "92345922687");
            when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(borrowed0Books);
            // When
            List<Book> borrowedBooks0 = bookLibrary.listBooksInHandsOf(user);
            // Then
            assertEquals(0, borrowedBooks0.size());

        }

        @Test
        void testListBooksInHandsOfOne() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> borrowed1Books = generateListOfNBooks(1);
            LibraryUser user = new LibraryUser("First", "Last", "92345922687");
            when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(borrowed1Books);
            // When
            List<Book> borrowedBooks1 = bookLibrary.listBooksInHandsOf(user);
            // Then
            assertEquals(1, borrowedBooks1.size());

        }

        @Test
        void testListBooksInHandsOfFive() {
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> borrowed5Books = generateListOfNBooks(5);
            LibraryUser user = new LibraryUser("First", "Last", "92345922687");
            when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(borrowed5Books);
            // When
            List<Book> borrowedBooks5 = bookLibrary.listBooksInHandsOf(user);
            // Then
            assertEquals(5, borrowedBooks5.size());
        }

    }
}