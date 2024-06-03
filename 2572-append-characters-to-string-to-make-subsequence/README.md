<h2><a href="https://leetcode.com/problems/append-characters-to-string-to-make-subsequence">Append Characters to String to Make Subsequence</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>You are given two strings <code>s</code> and <code>t</code> consisting of only lowercase English letters.</p>

<p>Return <em>the minimum number of characters that need to be appended to the end of </em><code>s</code><em> so that </em><code>t</code><em> becomes a <strong>subsequence</strong> of </em><code>s</code>.</p>

<p>A <strong>subsequence</strong> is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;coaching&quot;, t = &quot;coding&quot;
<strong>Output:</strong> 4
<strong>Explanation:</strong> Append the characters &quot;ding&quot; to the end of s so that s = &quot;coachingding&quot;.
Now, t is a subsequence of s (&quot;<u><strong>co</strong></u>aching<u><strong>ding</strong></u>&quot;).
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcde&quot;, t = &quot;a&quot;
<strong>Output:</strong> 0
<strong>Explanation:</strong> t is already a subsequence of s (&quot;<u><strong>a</strong></u>bcde&quot;).
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;z&quot;, t = &quot;abcde&quot;
<strong>Output:</strong> 5
<strong>Explanation:</strong> Append the characters &quot;abcde&quot; to the end of s so that s = &quot;zabcde&quot;.
Now, t is a subsequence of s (&quot;z<u><strong>abcde</strong></u>&quot;).
It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length, t.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> and <code>t</code> consist only of lowercase English letters.</li>
</ul>

# Explaination
## Intuition

To make `t` a subsequence of `s`, we need to find the longest prefix of `t` that is already a subsequence of `s`. The remaining characters of `t` that are not part of this longest prefix will need to be appended to the end of `s`.

## Approach

### Two Pointers Technique:

1. Use two pointers, one (`i`) for `s` and one (`j`) for `t`.
2. Traverse through `s` and `t` simultaneously. If characters `s[i]` and `t[j]` match, move both pointers forward. If they don’t match, move only the pointer `i` for `s`.
3. The goal is to find how many characters from `t` we can match in `s` sequentially.

### Remaining Characters:

- After the traversal, if the pointer `j` is equal to the length of `t`, it means all characters in `t` are matched in `s`, and no characters need to be appended.
- Otherwise, the number of characters that need to be appended is the length of `t` minus the position of `j`.

## Complexity Analysis

- **Time Complexity**: O(n + m), where `n` is the length of `s` and `m` is the length of `t`. This is because we are traversing both strings once.
- **Space Complexity**: O(1), as we are using a constant amount of space for the pointers and no additional data structures.

## Explanation with Example

### Example 1:

**s = "coaching"**, **t = "coding"**

Traverse through `s` and match characters with `t`:
- `c` matches `c`
- `o` matches `o`
- `a` does not match `d`
- `c` does not match `d`
- `h` does not match `d`
- `i` matches `d`
- `n` does not match `i`
- `g` matches `i`

Remaining characters in `t` after matching: "ding"\
Append "ding" to `s`\
**Output**: 4

### Example 2:

**s = "abcde"**, **t = "a"**

`t` is already a subsequence of `s`.\
**Output**: 0

### Example 3:

**s = "z"**, **t = "abcde"**

No characters in `s` match with `t`.\
Append "abcde" to `s`\
**Output**: 5

This approach ensures that we find the minimum number of characters that need to be appended to `s` so that `t` becomes a subsequence.

## Step-by-Step Explanation

1. **Initialize Pointers and Variables:**

   - `s_index` for string `s` starts at 0.
   - `t_index` for string `t` starts at 0.
   - `s_length` is the length of `s`.
   - `t_length` is the length of `t`.

2. **Traversing the Strings:**

   | Step | s_index | t_index | s[s_index] | t[t_index] | Action                        | Comment              |
   |------|---------|---------|------------|------------|------------------------------|----------------------|
   | 1    | 0       | 0       | 'c'        | 'c'        | Move both s_index and t_index | Characters match     |
   | 2    | 1       | 1       | 'o'        | 'o'        | Move both s_index and t_index | Characters match     |
   | 3    | 2       | 2       | 'a'        | 'd'        | Move s_index                  | Characters do not match |
   | 4    | 3       | 2       | 'c'        | 'd'        | Move s_index                  | Characters do not match |
   | 5    | 4       | 2       | 'h'        | 'd'        | Move s_index                  | Characters do not match |
   | 6    | 5       | 2       | 'i'        | 'd'        | Move s_index                  | Characters do not match |
   | 7    | 6       | 2       | 'n'        | 'd'        | Move s_index                  | Characters do not match |
   | 8    | 7       | 2       | 'g'        | 'd'        | Move s_index                  | Characters do not match |
   | 9    | 8       | 2       | End of s   | 'd'        | End of s, calculate remaining t | Remaining t is "ding" |

   **Observation:**
   - `t_index` is at position 2.
   - Remaining characters in `t` are `t[2:] = "ding"`.

3. **Calculate the Number of Characters to Append:**

   - Remaining characters in `t` that need to be appended to `s` = `t_length - t_index`.
   - For example, if `t = "coding"` and `t_index` is 2:
     - Remaining characters = `t[2:] = "ding"`.
     - Number of characters to append = 5 - 2 = 3.

**Final Result:**\
Append "ding" to `s` to make `t` a subsequence of `s`.\
**Output**: 4

## Summary

- Initialize pointers for `s` and `t`.
- Traverse through `s` using a while loop.
- Check character match and move pointers accordingly.
- Calculate remaining characters of `t` and return the count.

This approach efficiently finds the minimum number of characters to append to `s` to make `t` a subsequence of `s`.
