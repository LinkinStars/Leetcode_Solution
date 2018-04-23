## 11. Container With Most Water
### Description
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.


### Thinking 
1、two point
if start height smaller than end height, move the start.   
if end height smaller than start height, move the end.  
when we find a taller one, calculate the max container 