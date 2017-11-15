package com.konst007;

import junit.framework.TestCase;

public class CalculationImplTest extends TestCase {

    CalculationImpl calculation = new CalculationImpl();

    public void testCalculateStageLength() throws Exception {

        assertEquals(3, calculation.calculateStageLength(2, 0, 7));

    }

    public void testIsPossibleMove() throws Exception {

        Stage stage = new Stage();
        stage.setLength(7);
        Dancer dancer = new Dancer();
        dancer.setStage(stage);
        dancer.setPosition(5);

        assertEquals(false, calculation.isPossibleMove(4, dancer));
        assertEquals(true, calculation.isPossibleMove(2, dancer));
        assertEquals(false, calculation.isPossibleMove(7, dancer));
        assertEquals(true, calculation.isPossibleMove(5, dancer));

    }

    public void testIsEndOfDance() throws Exception {

        Stage stage = new Stage();
        stage.setLength(7);
        Dancer dancer = new Dancer();
        dancer.setStage(stage);
        dancer.setPosition(0);

        assertEquals(true, calculation.isEndOfDance(3, dancer));
        assertEquals(false, calculation.isEndOfDance(2, dancer));

    }

    public void testCalculateSteps() throws Exception {

        assertEquals(4, calculation.calculateSteps(2, 0, 7));

    }

}