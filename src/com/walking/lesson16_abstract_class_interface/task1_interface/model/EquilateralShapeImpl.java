package com.walking.lesson16_abstract_class_interface.task1_interface.model;

public abstract class EquilateralShapeImpl implements EquilateralShape {
    protected final int length;

    protected EquilateralShapeImpl(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
