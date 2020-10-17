package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        LocalDate minAge = LocalDate.of(2000,10,17);

        Map<Integer, ForumUser> userMap = theForum.getUserList().stream()
                .filter(user-> user.getGender() == 'M')
                .filter(user -> user.getBirthDate().isBefore(minAge))
                .filter(user -> user.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# elements: " + userMap.size());
        userMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}