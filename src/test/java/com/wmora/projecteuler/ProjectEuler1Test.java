package com.wmora.projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProjectEuler1Test {

    @Test
    public void sumOfMultiplesTest() {
        assertTrue(2318 == ProjectEuler1.solution(100));
    }

    @Test
    public void sumOfMultiplesTest2() {
        assertTrue(23 == ProjectEuler1.solution(10));
    }

    @Test
    public void sumOfMultiplesTest3() {
        assertEquals(233333333166666668L, ProjectEuler1.solution(1000000000));
    }

    @Test
    public void sumOfMultiplesTest4() {
        assertTrue(0 == ProjectEuler1.solution(3));
    }

}
