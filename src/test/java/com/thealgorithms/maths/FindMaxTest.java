package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxTest {
    
    @Test
    public void testFindMaxValue(){
        assertEquals(11, FindMax.findMax(new int[] {11,2,3,4,5,6,7,8,9,10}));
    }
}
