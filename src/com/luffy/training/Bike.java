package com.luffy.training;

public class Bike {

    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    public Bike(String wheelShape){
        this.wheelShape=wheelShape;
    }

    public Bike(String wheelShape,int wheelNum){
        this.wheelShape=wheelShape;
        this.wheelNum = wheelNum;
    }

    public void setWheelShape(String wheelShape) {
        this.wheelShape = wheelShape;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public void setSeatShape(String seatShape) {
        this.seatShape = seatShape;
    }
}





