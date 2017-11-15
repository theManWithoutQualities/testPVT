package com.konst007;

import junit.framework.TestCase;

/**
 * Created by x on 16.11.17.
 */
public class CalculationImplTest extends TestCase {

    CalculationImpl calculation = new CalculationImpl();

    public void testCalculateStageLength() throws Exception {

        assertEquals(3, calculation.calculateStageLength(2, 0, 7));

    }

    public void testCalculateSteps() throws Exception {
    }

}