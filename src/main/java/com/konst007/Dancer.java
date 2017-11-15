package com.konst007;

public class Dancer {

    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move(int distance) {

        if(distance%2==0)
            position+=distance;
        else
            position-=distance;

    }
}
