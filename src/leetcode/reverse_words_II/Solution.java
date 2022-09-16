package leetcode.reverse_words_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String reverseEachWord(String word) {
        char[] charArr = word.toCharArray();
        int midIdx = word.length() / 2;
        for(int i = 0; i < midIdx; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - i - 1];
            charArr[charArr.length - i - 1] = temp;
        }
        return new String(charArr);
    }
    public String reverseWords(String s) {
        //https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1165/
        String[] strArray = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(String str : strArray) {
            str = reverseEachWord(str);
            sb.append(str).append(" ");
        }
        String finalStr = sb.toString().trim();
        return finalStr;
    }
}
