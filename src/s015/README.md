## 15. 3Sum
### Description
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]


### Thinking 
1、O(n^3)  
you can find all the case use dfs or bfs  
  
2、sort & bidirectional search  
The problem like this can be solve by sort usually.
After sort the array, you can find the target easily by bidirectional search.  