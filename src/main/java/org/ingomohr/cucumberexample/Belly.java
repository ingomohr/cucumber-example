package org.ingomohr.cucumberexample;

public class Belly {

    private int unitsToDigest;

    public Belly() {
        this.unitsToDigest = 0;
    }

    public void eat(int units) {
        this.unitsToDigest += units;
    }

    public void digest(int hours) {
        this.unitsToDigest = Math.max(0, this.unitsToDigest - 2 * hours);
    }

    public boolean growls() {
        return unitsToDigest < 1;
    }

    public int getUnitsToDigest() {
        return unitsToDigest;
    }

}