package test;
import apps.JUnitApplication;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/*
-Unit Testing is the first level of testing.
-In this stage, we cover the classes, objects, methods, functions, etc.
-JUnit is a good tool for this purpose.
-The approach is "test a little, code a little, test a little, code a little..."
But there are some disadvantages to this method. After every coding stage, the program becomes more complex.
For that reason, we must consider these two issues additionally:
1- New codes may cause some defects even if there are no defects in the old code
2- Old successful tests may be unsuccessful after the new coding stage.
*/

public class UnitTest {
    static JUnitApplication app = new JUnitApplication();

    @Test
    public void testPerfect() {
        assertEquals(true, app.perfectNumber(28));
        assertNotEquals(false, app.perfectNumber(28));
        assertNotEquals(null, app.perfectNumber(28));
        assertEquals(false, app.perfectNumber(-4));
        assertNotEquals(true, app.perfectNumber(-4));
        assertNotEquals(null, app.perfectNumber(-4));
        assertEquals(false, app.perfectNumber(50));
        assertNotEquals(true, app.perfectNumber(50));
        assertNotEquals(null, app.perfectNumber(50));
    }

    @Test
    public void testSumOdds() {
        assertEquals(0, app.sumOdds(0));
        assertEquals(0, app.sumOdds(-1));
        assertEquals(0, app.sumOdds(-23));
        assertEquals(9, app.sumOdds(5));
        assertEquals(9, app.sumOdds(6));
        assertNotEquals(16, app.sumOdds(5));
        assertNotEquals(16, app.sumOdds(6));
        assertEquals(16, app.sumOdds(7));
        assertEquals(16, app.sumOdds(8));
        assertNotEquals(25, app.sumOdds(7));
        assertNotEquals(25, app.sumOdds(8));

        // The sum of odd numbers between [1, 101] is 2601,
        //but the requirements of the method say that inputs can only be in the range [1,100].
        assertNotEquals(2601, app.sumOdds(101));

        assertEquals(0, app.sumOdds(-1));
    }

    @Test
    public void testConcateText() {
        assertEquals("withjavatestingisgoodat", app.concateText("with", "java"));
        assertEquals("testingisgoodat", app.concateText("", ""));
        assertEquals("  testingisgoodat", app.concateText(" ", " "));
        assertNotEquals("testingisgoodat", app.concateText(" ", " "));
        assertEquals(" testingisgoodat", app.concateText("", " "));
        assertNotEquals("testingisgoodat", app.concateText("", " "));
        assertEquals(" testingisgoodat", app.concateText(" ", ""));
        assertEquals("\n\ntestingisgoodat", app.concateText("\n", "\n"));
        assertEquals("\n testingisgoodat", app.concateText("\n", " "));
        assertNotEquals(" \ntestingisgoodat", app.concateText("\n", " "));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, app.fibonacci(0));
        assertNotEquals(1, app.fibonacci(0));
        assertEquals(1, app.fibonacci(1));
        assertNotEquals(2, app.fibonacci(1));
        assertNotEquals(2, app.fibonacci(2));
        assertEquals(72723460248141l, app.fibonacci(68));
        assertEquals(7540113804746346429l, app.fibonacci(92));
        assertEquals(0, app.fibonacci(-1));
        assertEquals(0, app.fibonacci(-25));
    }
}