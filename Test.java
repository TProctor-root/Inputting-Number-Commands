import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
	private final double EPSILON = 1e-13;
	
    @Test
    public void test_problem3() {
        Main tester = new Main();
        assertEquals("1 6 3 8 4", tester.problem3_printDigits(16384));
    }

    @Test
    public void test_problem4() {
        Easter myEaster = new Easter(2001);
        assertEquals(4, myEaster.getEasterSundayMonth());
    }

    @Test
    public void test_problem5() {
        Triangle triangle = new Triangle(0, 5, 1.5, 2, 8, 25.92);
        assertEquals(3.3541019662496847, triangle.getSide1Length(), EPSILON);
        assertEquals(22.39746414217467,triangle.getSide2Length(), EPSILON);
        assertEquals(24.787424230847385,triangle.getSide3Length(), EPSILON);
        assertEquals(2.312694531902217,triangle.getAngle1(), EPSILON);
        assertEquals(0.7289796952097912,triangle.getAngle2(), EPSILON);
        assertEquals(0.09991842647778622,triangle.getAngle3(), EPSILON);
        assertEquals(50.53899033927174,triangle.getPerimeter(), EPSILON);
        assertEquals(27.690000000000044,triangle.getArea(), EPSILON);
    }

    @Test
    public void test_problem6() {
        Main tester = new Main();
        assertEquals(-1.0, tester.problem6_getNumericGrade("G"));
        assertEquals("B", tester.problem6_getLetterGrade(2.85));
    }

    @Test
    public void test_problem7() {
        Main tester = new Main();
        assertEquals("Hi", tester.problem7_withoutX2("xHi"));
    }

    @Test
    public void test_problem8() {
        Paycheck p1 = new Paycheck(10.5, 42);
        assertEquals(451.5, p1.getPay());
    }

    @Test
    public void test_problem9() {
        Year y = new Year(1980);
        assertEquals(true, y.isLeapYear());
    }

    @Test
    public void test_problem10() {
        Main tester = new Main();
        assertEquals("MCMLXXVIII", tester.problem10_getRomanNumerals(1978));
    }
}

