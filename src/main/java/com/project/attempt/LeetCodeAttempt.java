package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countingWordsWithAGivenPrefix(new String[] {"pay","attention","practice","attend"}, "at"));
        System.out.println(countingWordsWithAGivenPrefix(new String[] {"leetcode","win","loops","success"}, "code"));

    }

    public static int countingWordsWithAGivenPrefix(String[] words, String pref) {

        int answer = 0;

        for (String word : words) {

            if (word.length() < pref.length()) { continue; }

            if (word.startsWith(pref)) { answer++; }

        }

        return answer;

    }

}
