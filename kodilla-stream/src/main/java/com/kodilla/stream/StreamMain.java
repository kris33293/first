package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.*;


public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        LocalDate minAge = LocalDate.of(2000,10,17);

        Map<String, Book> userMap = theForum.getUserList().stream()
                .filter(user -> user.getGender() == 'M');
                    .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

    }
}