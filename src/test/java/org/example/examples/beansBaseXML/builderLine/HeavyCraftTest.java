package org.example.examples.beansBaseXML.builderLine;

import org.example.helpClasses.Craft;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeavyCraftTest {
    @Test
    public void testWork() {
        HeavyCraft hc = new HeavyCraft();
        Object res = hc.work();
        assertTrue(res != null && res.getClass().equals(Craft.class));
    }

    @Test
    public void testGetModel() {
        HeavyCraft hc = new HeavyCraft();
        assertEquals("HeavyCraft", hc.getModel());
    }
}