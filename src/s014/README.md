## 14. Longest Common Prefix
### Description
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]  
Output: "fl"

Example 2:

Input: ["dog","racecar","car"]  
Output: ""  
Explanation: There is no common prefix among the input strings.

Note:

All given inputs are in lowercase letters a-z.



### Thinking 
1、record current char and next char is enough
only when 'cur' is smaller than 'next' can be subtracted 