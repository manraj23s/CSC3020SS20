package com.csc3020.hw04MidTermProject.gv7006;

abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;
    
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    
    public double getLeftVal() {
        return leftVal;
    }
    
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    
    public double getRightVal() {
        return rightVal;
    }
    
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    
    public double getResult() {
        return result;
    }
    
    protected void setResult(double result) {
        this.result = result;
    }
    
    abstract public void calculate();
}
