package org.example.tests.beansBaseXML.builderLine;

import junit.framework.TestCase;
import org.example.helpClasses.Craft;

public class HeavyCraftTest extends TestCase {

    public void testWork() {
        HeavyCraft hc = new HeavyCraft();
        Object res = hc.work();
        assertTrue(res != null && res.getClass().equals(Craft.class));
    }

    public void testGetModel() {
        HeavyCraft hc = new HeavyCraft();
        assertEquals("HeavyCraft", hc.getModel());
    }
}