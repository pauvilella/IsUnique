# IsUnique
Exercise related with Arrays and Strings.

## Exercise Challenge
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

### Solution
I implemented it with an array that has 128 length and each position corresponds to one element on the alphabet. 
When we see a character, we set to true the element whose index is the character we found.
This would take O(min(c, n)) runtime, where c is the set of characters (128 in our case) and n is the length of the string. 
We see we can argue that the runtime is O(1) because we will never iterate more than 128 times (in our case).