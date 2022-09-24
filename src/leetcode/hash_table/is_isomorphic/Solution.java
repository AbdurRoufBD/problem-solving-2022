package leetcode.hash_table.is_isomorphic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }

        int len = s.length();
        for(int i = 0; i < len; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(sMap.containsKey(sc)) {
                sMap.put(sc, sMap.get(sc) + 1);
            } else {
                sMap.put(sc, 1);
            }

            if(tMap.containsKey(tc)) {
                tMap.put(tc, tMap.get(tc) + 1);
            } else {
                tMap.put(tc, 1);
            }
        }

        if(sMap.size() != tMap.size()) {
            return false;
        }

        List<Integer> sMapList = new ArrayList<>(sMap.values());
        List<Integer> tMapList = new ArrayList<>(sMap.values());
        for(int i = 0; i < sMapList.size(); i++) {
            if(sMapList.get(i) != tMapList.get(i)) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }
}
