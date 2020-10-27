package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge second = new SecondChallenge();

        try {
            second.probablyIWillThrowException(2.0,0.5);
        } catch (Exception e) {
            System.out.println("Zle dane!");
        }


    }


}

class FileReaderTestSuite {
    @Test
    public void testProbablyIWillThrowException() {
        // given
        SecondChallenge second = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(SecondChallengeException.class, () -> second.probablyIWillThrowException(2.0,1.5)));
    }
}

