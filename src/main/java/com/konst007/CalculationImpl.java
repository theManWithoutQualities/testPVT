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

    public boolean isEndOfDance(int distance, Dancer dancer) {

        if((!isPossibleMove(distance, dancer))&&(dancer.getPosition()==0))
            return true;
        else
            return false;

    }

    public int calculateSteps(int... input) {

        Stage stage = new Stage();
        stage.setLength(calculateStageLength(input));

        Dancer dancer = new Dancer();
        dancer.setStage(stage);

        int ind=0;
        int sum=0;
        int[] flags = new int[input.length];
        while (!isEndOfDance(input[ind], dancer)){

            if(flags[ind]==1)
                return -1;
            if(dancer.getPosition()==0)
                flags[ind]=1;

            if(isPossibleMove(input[ind], dancer)){
                sum+=input[ind];
                dancer.move(input[ind]);
                ind=(ind+1)%input.length;
            }
            else{
                sum+=dancer.getPosition();
                dancer.moveBack();
            }
        }


        return sum;

    }

}
