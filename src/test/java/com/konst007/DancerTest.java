package com.konst007;

import junit.framework.TestCase;

public class DancerTest extends TestCase {

    Dancer dancer = new Dancer();

    public void testMove() throws Exception {

        dancer.setPosition(5);
        dancer.move(2);
        assertEquals(7, dancer.getPosition());

        dancer.setPosition(5);
        dancer.move(3);
        assertEquals(2, dancer.getPosition());

    }

    public void testMoveBack() throws Exception {

        dancer.setPosition(5);
        dancer.moveBack();
        assertEquals(0, dancer.getPosition());

    }

}