## 4. Median of Two Sorted Arrays
### Description
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:  
nums1 = [1, 3]  
nums2 = [2]  

The median is 2.0  
Example 2:  
nums1 = [1, 2]  
nums2 = [3, 4]  

The median is (2 + 3)/2 = 2.5

### Thinking 
1、get length and compare   
get the length of two array and get the median index  
compare the head of two array and find the middle  
run time complexity should be O((m+n)/2).  

2、dichotomy  
every time cut down the half of mid    
[1,3,5,7]    
[2,4,6]  
sum = 7  
mid = 4  

first remove 2  
because 3 < 4 so remove 1,3  
[5,7]  
[2,4,6]  
mid = 4 - 2 = 2  

second remove 1  
because 5 > 2 so remove 2  
[5,7]  
[4,6]  
mid = 2 - 1 = 1  

finally get 1  
because 5 > 4 so get 4  
the middle is 4  
  