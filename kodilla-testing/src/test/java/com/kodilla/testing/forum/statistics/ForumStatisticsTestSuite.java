package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;
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
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsDatabaseMock;

    @Nested
    @DisplayName("Test for calculateAdvStatistics")
    class TestCalculateAdvStatistics {

        @Test
        void testCalculateAdvStatisticsZeroZeroZero() {
            // Given
            ForumStatistics statisticsDatabase = new ForumStatistics(statisticsDatabaseMock);
            List<User> zeroUsersList = new ArrayList<>();
            int zero = 0;
            when(statisticsDatabaseMock.usersNames()).thenReturn(zeroUsersList);
            when(statisticsDatabaseMock.postsCount()).thenReturn(zero);
            when(statisticsDatabaseMock.commentsCount()).thenReturn(zero);
            // When
            statisticsDatabase.calculateAdvStatistics(statisticsDatabaseMock);
            List <Double> zeroList = statisticsDatabase.showStatistics();
            // Then






        }


    }


}
