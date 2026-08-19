<h2><a href="https://www.geeksforgeeks.org/problems/play-with-an-array/1">Play with an array</a></h2><h3>Easy</h3><hr>Given a 0-indexed array arr[] of positive integers, determine if it is possible to rearrange the array elements such that the number at the odd index is strictly greater than the number at the previous even index.Formally, return true if the array can be rearranged such that arr[i] &gt; arr[i-1] for all valid odd indices. Otherwise, return false.
Examples:
Input: arr[] = [5, 4, 3, 2, 1]
Output: true
Explanation: Rearranging to [4, 5, 2, 3, 1] is valid because the elements at odd indices are strictly greater than the preceding even indices (5 &gt; 4 and 3 &gt; 2).
Input: arr[] = [4, 1, 1, 1]
Output: falseExplanation: No rearrangement exists that satisfies the given condition.
Constraints:1 ≤ arr.size() ≤ 1051 ≤ arr[i] ≤ 106
