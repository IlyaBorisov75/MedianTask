package com.test.project.api;

import java.util.*;

public class Median {
    private List<Integer> nums = new ArrayList<>();

    public void pushNum(int num){
        synchronized(this){
            nums.add(num);
        }
    }

    public void pushNums(int[] nums){
        synchronized(this){
            Arrays.stream(nums).forEach(n -> this.nums.add(n));
        }
    }

    public double getMedian(){
        List<Integer> sortedNums = sort(new ArrayList<>(nums));
        if(nums.size() % 2 == 0){
            return (sortedNums.get(sortedNums.size()/2) + sortedNums.get((sortedNums.size()/2)+1))/2;
        }else{
            return (sortedNums.get(sortedNums.size()/2));
        }
    }

    private List<Integer> sort(List<Integer> nums) {
        Collections.sort(nums);
        return nums;
    }
}
