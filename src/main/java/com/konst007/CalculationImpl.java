package com.konst007;

public class CalculationImpl implements Calculation{

    public int calculateStageLength(int... input) {

        return input.length;

    }

    public boolean isPossibleMove(int distance, Dancer dancer) {

        if((distance%2==0)&&(dancer.getPosition()+distance>dancer.getStage().getLength()))
            return false;
        if((distance%2!=0)&&(dancer.getPosition()-distance<0))
            return false;
        return true;

    }

    public int calculateSteps(int... input) {

        return 0;

    }

}
