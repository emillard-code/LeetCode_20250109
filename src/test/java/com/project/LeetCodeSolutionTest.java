package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void prefixCountTest() {

        assertEquals(2, LeetCodeSolution.prefixCount(new String[] {"pay","attention","practice","attend"}, "at"));
        assertEquals(0, LeetCodeSolution.prefixCount(new String[] {"leetcode","win","loops","success"}, "code"));

    }

}
