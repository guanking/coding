package com.coding.kege.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], integer -> new ArrayList<>()).add(i);
        }
        for (int i = 0, j; i < nums.length; i++) {
            List<Integer> index = map.get(target - nums[i]);
            if (index != null && (j = index.get(index.size() - 1)) != i) {
                return new int[]{i, j};
            }
        }
        return new int[]{0, 0};
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.asList(strs).stream().collect(Collectors.groupingBy(str -> {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        })).values());
    }
}
