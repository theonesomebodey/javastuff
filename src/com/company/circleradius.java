package com.company;

public class circleradius {
    double number;
    public circleradius(double r){
        this.number = r;
    }
    double getcircumference(double r){
        return Math.PI*this.number*2;
    }
    double getarea(){
        return Math.PI*this.number*this.number;
    }
    public static void main(String[] args){
        circleradius circlestuff = new circleradius(432);
        System.out.println(circlestuff.getcircumference(432));
        System.out.println(circlestuff.getarea());
    }
}
