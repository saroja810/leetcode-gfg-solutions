# [Arrange Anagrams Together](https://www.geeksforgeeks.org/problems/print-anagrams-together/1)
## Medium
Given an array arr[] of strings, group all anagrams together. Two strings are anagrams if they contain the same characters with the same frequencies, possibly in a different order.Return a 2D array, where each inner array contains a group of anagrams. The relative order of strings within each group should be the same as their order in arr.Examples:Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
Input: arr[] = ["no", "on", "is"]
Output: [["is"], ["no", "on"]]
Explanation: There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.Input: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]Output: [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]Explanation: Group 1: "abc", "bac", and "cab" are anagrams.
Group 2: "listen", "silent", and "enlist" are anagrams.
Group 3: "rat", "tar", and "art" are anagrams