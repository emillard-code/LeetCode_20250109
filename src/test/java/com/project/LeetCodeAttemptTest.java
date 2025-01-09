package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countingWordsWithAGivenPrefixTest() {

        assertEquals(2, LeetCodeAttempt.countingWordsWithAGivenPrefix(new String[] {"pay","attention","practice","attend"}, "at"));
        assertEquals(0, LeetCodeAttempt.countingWordsWithAGivenPrefix(new String[] {"leetcode","win","loops","success"}, "code"));

    }

}
