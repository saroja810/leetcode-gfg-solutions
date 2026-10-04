# [Generate Parentheses](https://www.geeksforgeeks.org/problems/generate-all-possible-parentheses/1)
## Medium
Given a number n, return all the combinations of balanced parentheses of length n.Note: A sequence of parentheses is balanced if every opening bracket has a corresponding closing bracket in the correct order.For example, "(())", "()()", and "(()())" are balanced, whereas ")()(", "))((", and "()))" are not.
Examples:
Input: n = 6
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]Explanation: These are the only possible valid balanced parentheses.
Input: n = 4
Output: ["(())", "()()"]Explanation: These are the only possible valid balanced parentheses.
Constraints: 1 ≤ n ≤ 16
n % 2 == 0