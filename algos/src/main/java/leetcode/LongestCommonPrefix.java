package leetcode;

import java.util.*;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String longestString = "";
        String shortestStringAmongAll = strs[0];
        for (String str: strs) {
          if (str.length() < shortestStringAmongAll.length()) {
              shortestStringAmongAll = str;
          }
        }
        Map<String, Boolean> occurancesMap = new LinkedHashMap<>();
        Set<String> occurances = findSubstrings(shortestStringAmongAll);
        for (String entry: occurances) {
            boolean contains = containsSubstring(strs, entry);
            occurancesMap.put(entry, contains);
        }
        for (Map.Entry<String, Boolean> n3: occurancesMap.entrySet()) {
            if (n3.getValue()) {
                String key = n3.getKey();
                if (key.length() > longestString.length()) {
                    longestString = key;
                }
            }
        }
        return longestString;
    }

    public static LinkedHashSet<String> findSubstrings(String inputString) {
        LinkedHashSet<String> substrings = new LinkedHashSet<>();
        for (int i=0; i<inputString.length(); i++) {
            for (int j=i+1; j<=inputString.length(); j++) {
                substrings.add(inputString.substring(i, j));
            }
        }
        return substrings;
    }

    public static boolean containsSubstring(String[] strs, String subString ) {
        for (String s: strs) {
           if (!s.contains(subString)) {
               return false;
           }
        }
        return true;
    }
}
