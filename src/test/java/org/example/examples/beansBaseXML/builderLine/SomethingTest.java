package org.example.examples.beansBaseXML.builderLine;

import org.example.debris.Something;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SomethingTest {
    private static Something somethingTestObject1;
    private static Something somethingTestObject2;
    private static Something somethingTestObject3;
    @Mock
    List<Integer> mockedList;

    @BeforeAll //@BeforeEach
    public static void init() {
        somethingTestObject1 = new Something(4, 5);
        somethingTestObject2 = new Something(4, 0);
        somethingTestObject3 = new Something(4, -5);
    }

    @AfterAll
    public static void testExecuted() {
        System.out.println("test work done");
    }

    @Test
    public void testResult1() {
        assertEquals(9, somethingTestObject1.result1());
        assertEquals(4, somethingTestObject2.result1());
        assertEquals(-1, somethingTestObject3.result1());
    }

    @Test
    public void testResult2() {
        assertEquals(20, somethingTestObject1.result2());
        assertEquals(0, somethingTestObject2.result2());
        assertEquals(-20, somethingTestObject3.result2());
    }

    @Test
    public void testResult3() {
        mockedList.add(4);
        Mockito.when(mockedList.get(0)).thenReturn(4);

        assertEquals(4, mockedList.get(0));
        assertEquals(80, somethingTestObject1.result2() * mockedList.get(0));
    }

}
