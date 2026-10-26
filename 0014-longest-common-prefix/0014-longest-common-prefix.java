class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Assume the first string is the prefix
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // Check while the current string does not start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shrink the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}