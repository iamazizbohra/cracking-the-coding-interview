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

**EXAMPLE** <br>
Input: "Mr John Smith " <br>
Output: "Mr%20John%20Smith"

#### Optimal Solutions

1. [Solution using auxiliary array](src/main/java/com/crackingthecodinginterview/questions/chapter1/question3/Solution.java)

---

#### 1.4 Palindrome Permutation

Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

**EXAMPLE** <br>
Input: Tact Coa <br>
Output: true (permutations: "taco cat", "atc o eta" etc.)

#### Optimal Solutions

1. [Solution using bit vector](src/main/java/com/crackingthecodinginterview/questions/chapter1/question4/Solution.java)

---

#### 1.5 One Away 

There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

**EXAMPLE** <br>
pale,  ple  -> true <br>
pales, pale -> true <br>
pale,  bale -> true <br>
pale,  bae  -> false

#### Optimal Solutions

1. [Solution](src/main/java/com/crackingthecodinginterview/questions/chapter1/question5/Solution.java)

---

#### 1.6 String Compression

Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

#### Performance Benchmarking: String vs String Builder
[Click here](https://dev.to/this-is-learning/performance-benchmarking-string-and-string-builder-3bid)

#### Optimal Solutions

1. [Solution using string builder](src/main/java/com/crackingthecodinginterview/questions/chapter1/question6/Solution.java)

---

#### 1.7 Rotate Matrix 

Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

#### Optimal Solutions

1. [Solution using layer approach](src/main/java/com/crackingthecodinginterview/questions/chapter1/question7/Solution.java)
___

#### Run Tests

```text
mvn test
```

#### JACOCO Report
```text
file:///[path to project folder]/target/site/jacoco/index.html
```