/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * @author Thomas
 * @since 2023-08-29
 */
public class LongestSubstringWithoutRepeatingCharacters {

        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            int maxLength = 0;
            int[] charIndex = new int[128]; 
            
            for (int i = 0, j = 0; j < n; j++) {
                if (charIndex[s.charAt(j)] > i) {
                    i = charIndex[s.charAt(j)];
                }
                
                charIndex[s.charAt(j)] = j + 1;
                
                maxLength = Math.max(maxLength, j - i + 1);
            }
            return maxLength;
        }
       
}
