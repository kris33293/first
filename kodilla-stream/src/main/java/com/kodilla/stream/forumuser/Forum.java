package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        LocalDate date;
        date = LocalDate.of(1991, 3, 22);
        userList.add(new ForumUser(1, "user1", 'M', date, 10));
        date = LocalDate.of(2002, 3, 22);
        userList.add(new ForumUser(2, "user2", 'F', date, 100));
        date = LocalDate.of(1996, 3, 22);
        userList.add(new ForumUser(3, "user3", 'M', date, 150));
        date = LocalDate.of(2000, 11, 22);
        userList.add(new ForumUser(4, "user4", 'F', date, 1110));
        date = LocalDate.of(2012, 3, 22);
        userList.add(new ForumUser(5, "user5", 'M', date, 1020));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
