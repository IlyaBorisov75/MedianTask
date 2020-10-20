package com.test.project.api;

import java.util.*;

public class TaskOne {

    Map<Integer, List<Integer>> flowMap = new HashMap<>();

    public void calculateWeight(ElementOfTree treeElement, List<Integer> steps, Integer lastWeight){
        List<Integer> currentSteps = new LinkedList<>(steps);
        currentSteps.add(treeElement.getValue());
        Integer weight = lastWeight + treeElement.getValue();
        if(!Objects.isNull(treeElement.getChildOne())){
            calculateWeight(treeElement.getChildOne(), currentSteps, weight);
        }else if(!Objects.isNull(treeElement.getChildTwo())){
            calculateWeight(treeElement.getChildTwo(), currentSteps, weight);
        }else{
             flowMap.put(weight, currentSteps);
        }
    }
}
