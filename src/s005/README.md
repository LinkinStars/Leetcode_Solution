## 5. Longest Palindromic Substring
### Description
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
 

Example:

Input: "cbbd"

Output: "bb"

### Thinking 
1、reverse & LCS  
Reverse S to S'  
Find the longest common substring between S and S' , which must also be the longest palindromic substring.  

2、enumeration & extend
Enumerate every character and extend to get the longest palindromic substring.    

3、Manacher's Algorithm  
https://articles.leetcode.com/longest-palindromic-substring-part-ii/  