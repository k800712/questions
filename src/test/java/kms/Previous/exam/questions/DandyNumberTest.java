package kms.Previous.exam.questions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DandyNumberTest {

    private final DandyNumber dandyNumber = new DandyNumber();

    @Test
    void testExample1() {
        assertEquals(222, dandyNumber.solution("12223"));
    }
    @Test
    void testExample2() {
        assertEquals(999, dandyNumber.solution("111999333"));
    }
    @Test
    void testExample3() {
        assertEquals(-1, dandyNumber.solution("123"));
    }
    @Test
    void testAllZeros() {
        assertEquals(0, dandyNumber.solution("000"));
    }
    @Test
    void testMultipleZeros() {
        assertEquals(0, dandyNumber.solution("1000234"));
    }
    @Test
    void testSingleDigitRepeated() {
        assertEquals(555, dandyNumber.solution("5555555"));
    }
    @Test
    void testNoValidDandyNumber() {
        assertEquals(-1, dandyNumber.solution("12345"));
    }
    @Test
    void testEmptyString() {
        assertEquals(-1, dandyNumber.solution(""));
    }
    @Test
    void testStringLengthLessThanThree() {
        assertEquals(-1, dandyNumber.solution("12"));
    }
    @Test
    void testMultipleDandyNumbers() {
        assertEquals(999, dandyNumber.solution("111222333444555666777888999"));
    }
}
