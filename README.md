### Cracking The Coding Interview
189 programming interview questions, ranging from the basics to the trickiest algorithm problems.

---

### Arrays and Strings


#### 1.1 Is Unique

Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

#### (ASCII vs Unicode)
[How Unicode Works](https://deliciousbrains.com/how-unicode-works)

#### Solutions
If we can't use additional data structures, we can do the following:
1. Compare every character of the string to every other character of the string. This will take 0(n2) time and 0(1) space.
2. If we are allowed to modify the input string, we could sort the string in O(n log(n)) time and then linearly check the string for neighboring characters that are identical. Careful, though: many sorting algorithms take up extra space.

These solutions are not as optimal in some respects, but might be better depending on the constraints of the problem.

#### Optimal Solutions

1. [Solution using boolean array](src/main/java/com/crackingthecodinginterview/questions/chapter1/question1/Solution1.java)
2. [Solution using bit vector](src/main/java/com/crackingthecodinginterview/questions/chapter1/question1/Solution2.java)

---

#### 1.2 Check Permutation

Given two strings, write a method to decide if one is a permutation of the other.

#### Solutions

1. [Solution using sorting](src/main/java/com/crackingthecodinginterview/questions/chapter1/question2/Solution1.java)

#### Optimal Solutions

1. [Solution using integer array](src/main/java/com/crackingthecodinginterview/questions/chapter1/question2/Solution2.java)

---

#### 1.3 URLify

Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)

**EXAMPLE**
Input: "Mr John Smith "
Output: "Mr%20John%20Smith"

#### Optimal Solutions

1. [Solution using auxiliary array](src/main/java/com/crackingthecodinginterview/questions/chapter1/question3/Solution.java)

---

#### Run Tests

```text
mvn test
```