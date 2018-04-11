## 3. Longest Substring Without Repeating Characters
### Description
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

### Thinking 
1、array & queue  
use array to record the character that already appear  
use queue to record the substring  
if a character not exist in the array then add to the queue and array.  
if a character exist in the array queue poll elements until the same character appear.  

```java
public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
        return 0;
    }
    int result = 0;
    int[] characters = new int[256];
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
        char temp = s.charAt(i);
        if (characters[temp] != 1) {
            characters[temp] = 1;
            queue.offer(i);
            continue;
        }
        result = Math.max(result, queue.size());
        while (!queue.isEmpty()) {
            char cur = s.charAt(queue.poll());
            if (cur == temp) {
                queue.offer(i);
                break;
            }
            characters[cur] = 0;
        }
    }
    result = Math.max(result, queue.size());
    return result;
}
```

2、use two point to replace the queue  
use two point to record the substring just like the queue  

3、skip the superfluous operation  
when meet the same character we don't need to move point or poll element one by one  
we can skip the superfluous operation  
