package edu.badpals.cotxox.conductores;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    
    
public class ConductorTest {

    
    @Test
    public void testConductorValoracionMedia() {
        Conductor conductor = new Conductor();
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 0);
        double expResult = 4.0;
        assertEquals(expResult, conductor.getValoracion(), 0);
    }
}
    