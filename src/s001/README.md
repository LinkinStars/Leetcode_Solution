## 1. Two Sum
### Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

### Thinking 
1、Use two loop.  
One loop though each element and another loop though else element to find the result.
  
2、sort & double point.  
use map to record the element and it index.
sort the array.  
one 'start' point start at begin of array.    
another 'end' point start at the end of array.  
if the sum of two point is bigger than target 'end' point to back off.  
if the sum is smaller than target 'start' point to forward.  

3、map save the target - current number  
use the map to record the target - current number and it index  
if current number already exists in the map, we can get result.