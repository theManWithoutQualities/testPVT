package com.konst007;

public class Dancer {

    private int position;
    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

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

    public void moveBack() {

        position=0;

    }

}
