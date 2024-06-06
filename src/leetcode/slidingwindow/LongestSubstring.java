package leetcode.slidingwindow;

import java.util.HashSet;

public class LongestSubstring {
	
	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0;
		int start = 0;
		for(int end = 0 ; end < s.length() ; end++) {
			char currentChar = s.charAt(end);
			while(set.contains(currentChar)) {
				set.remove(s.charAt(start));
				start++;
			}
			set.add(currentChar);
			maxLength = Math.max(maxLength, end-start+1);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		LongestSubstring solution = new LongestSubstring();
		String s = "abcabcbb";
	    System.out.println("Length of the longest substring without repeating characters: " + solution.lengthOfLongestSubstring(s)); // Output: 3

	}

}
