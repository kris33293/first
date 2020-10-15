package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.naming.NameNotFoundException;
import java.util.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsDatabaseMock;

    private List<User> generateListOfNUsers(int userQuantity) {
        List<User> userList = new ArrayList<>();
        for (int n = 1; n <= userQuantity; n++) {
            User theUser = new User("User " + n, "email " + n, "1970 " + n);
            userList.add(theUser);
        }
        return userList;
    }

    @Nested
    @DisplayName("Test for calculateAdvStatistics")
    class TestCalculateAdvStatistics {

        @Test
        void testCalculateAdvStatistics0Posts() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = generateListOfNUsers(100);
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(0);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(100);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;

            // Then

            assertEquals(0, postsPerUser);
            assertEquals(1, commentsPerUser);
            assertEquals(0, commentsPerPost);
        }

        @Test
        void testCalculateAdvStatistics1000Posts() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = generateListOfNUsers(100);
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(10000);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;
            // Then
            assertEquals(10, postsPerUser);
            assertEquals(100, commentsPerUser);
            assertEquals(10, commentsPerPost);
        }

        @Test
        void testCalculateAdvStatistics0Comments() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = generateListOfNUsers(100);
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(0);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;
            // Then
            assertEquals(10, postsPerUser);
            assertEquals(0, commentsPerUser);
            assertEquals(0, commentsPerPost);
        }

        @Test
        void testCalculateAdvStatisticsMorePostsThanComments() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = generateListOfNUsers(100);
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(100);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;
            // Then
            assertEquals(10, postsPerUser);
            assertEquals(1, commentsPerUser);
            assertEquals(0.1, commentsPerPost);
        }

        @Test
        void testCalculateAdvStatisticsMoreCommentsThanPosts() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = generateListOfNUsers(100);
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(10000);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;
            // Then
            assertEquals(10, postsPerUser);
            assertEquals(100, commentsPerUser);
            assertEquals(10, commentsPerPost);
        }

        @Test
        void testCalculateAdvStatistics100users() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = generateListOfNUsers(100);
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(10000);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;
            // Then
            assertEquals(10, postsPerUser);
            assertEquals(100, commentsPerUser);
            assertEquals(10, commentsPerPost);
        }

        @Test
        void testCalculateAdvStatistics0users() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = new ArrayList<User>();
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(10000);
            // When
            statisticsDatabase.calculateAdvStatistics();
            double postsPerUser = statisticsDatabase.averagePostsPerUser;
            double commentsPerUser = statisticsDatabase.averageCommentsPerUser;
            double commentsPerPost = statisticsDatabase.averageCommentsPerPost;
            // Then

            assertEquals(0, postsPerUser);
            assertEquals(0, commentsPerUser);
            assertEquals(10, commentsPerPost);
        }


    }


}
