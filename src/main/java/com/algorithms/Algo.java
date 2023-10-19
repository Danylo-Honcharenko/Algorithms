package com.algorithms;

import java.util.HashSet;

public class Algo {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsStorage = new HashSet<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) jewelsStorage.add(jewels.charAt(i));
        for (int i = 0; i < stones.length(); i++) {
            char letter = stones.charAt(i);
            if (jewelsStorage.contains(letter)) count++;
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) count++;
            }
        }
        return count;
    }

    public int maxNumberOfBalloons(String text) {
        String target = "balloon";
        if (text == null || text.length() < target.length()) return 0;
        StringBuilder word = new StringBuilder();
        int i = 0;
        int match = 0;
        int index = text.indexOf(target.charAt(i));
        while(index != -1) {
            word.append(target.charAt(i++));
            text = text.substring(0, index) + text.substring(index + 1);
            if(word.toString().equals(target)) {
                word = new StringBuilder();
                match++;
                i = 0;
            }
            index = text.indexOf(target.charAt(i));
        }
        return match;
    }
}
