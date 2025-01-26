package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(countingWordsWithAGivenPrefix(new String[] {"pay","attention","practice","attend"}, "at"));
        System.out.println(countingWordsWithAGivenPrefix(new String[] {"leetcode","win","loops","success"}, "code"));

    }

    // This method will return the number of strings in words[] that contains string pref as a prefix.
    public static int countingWordsWithAGivenPrefix(String[] words, String pref) {

        int answer = 0;

        // We loop through all strings in words[] and test each one to see if it starts with
        // the characters in string pref. Increment int answer if yes, otherwise do nothing.
        for (String word : words) {

            if (word.length() < pref.length()) { continue; }

            if (word.startsWith(pref)) { answer++; }

        }

        // Return the final result we obtained.
        return answer;

    }

}
