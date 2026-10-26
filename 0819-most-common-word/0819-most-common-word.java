import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert the banned array into a HashSet for O(1) lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // Replace all non-letter characters with spaces, convert to lowercase, and split by spaces
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        
        // Count frequencies of words not in the banned set
        Map<String, Integer> countMap = new HashMap<>();
        String mostCommon = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (!word.isEmpty() && !bannedSet.contains(word)) {
                int count = countMap.getOrDefault(word, 0) + 1;
                countMap.put(word, count);
                
                // Keep track of the word with the highest frequency
                if (count > maxCount) {
                    maxCount = count;
                    mostCommon = word;
                }
            }
        }
        
        return mostCommon;
    }
}