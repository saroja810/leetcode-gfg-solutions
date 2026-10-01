# [Minimum Time to Finish Project](https://www.geeksforgeeks.org/problems/project-manager--141631/1)
## Medium
An IT company is working on a large project consisting of n modules. The given array time required (in months) to complete the ith module is stored in the array duration[]. The array dependencies[][], where dependencies[i] = [u, v], indicates that module v can be started only after module u is completed.&nbsp;Multiple modules can be worked on simultaneously as long as all their dependencies have been completed. Find the minimum time required to complete the entire project. If the project cannot be completed due to a cyclic dependency, return -1. A module is never dependent on itself.ExamplesInput: duration[] = [10, 20, 30, 10, 30, 20], dependencies[][] = [[5, 2], [5, 0], [4, 0], [4, 1], [2, 3], [3, 1]]
Output: 80
Explanation: 
The Graph of dependency forms this and the project will be completed when Module 1 is completed. The minimum taken time is 80 months, the maximum taken time is through the path 5 -&gt; 2 -&gt; 3 -&gt; 1 which takes 20 + 30 + 10 + 20Input: duration[] = [5, 5, 5], dependencies[][] = [[0, 1], [1, 2], [2, 0]]
Output: -1
Explanation: There is a cycle in the dependency graph hence the project cannot be completed.
