package com.test.project.api;

public class ElementOfTree {
    private ElementOfTree childOne;
    private ElementOfTree childTwo;
    private Integer value;

    public ElementOfTree getChildOne() {
        return childOne;
    }

    public void setChildOne(ElementOfTree childOne) {
        this.childOne = childOne;
    }

    public ElementOfTree getChildTwo() {
        return childTwo;
    }

    public void setChildTwo(ElementOfTree childTwo) {
        this.childTwo = childTwo;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
