package Assignments;

public class substring {
    public static int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        int hLength = haystack.length();
        int nLength = needle.length();

        // Loop through the haystack up to the point where the remaining characters are less than the needle length
        for (int i = 0; i <= hLength - nLength; i++) {
            // Check if the substring starting from index i matches the needle
            if (haystack.substring(i, i + nLength).equals(needle)) {
                return i; // Return the starting index
            }
        }

        // If no match is found
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int result = strStr(haystack, needle);
        System.out.println("Output: " + result); // Output: 2
    }
}

