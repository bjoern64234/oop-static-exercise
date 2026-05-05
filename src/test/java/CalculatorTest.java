import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition_isEqualByGivenParameters() {
        // Given
        int a = 5, b = 5;
        int expected = 10;
        // When
        int result = Calculator.addition(a, b);
        // Then
        assertEquals(expected, result);
    }

    @Test
    void subtraction_isEqualByGivenParameters() {
        // Given
        int a = 5, b = 6;
        int expected = -1;
        // When
        int result = Calculator.subtraction(a, b);
        // Then
        assertEquals(expected, result);
    }

    @Test
    void multiplication_isEqualByGivenParameters() {
        // Given
        int a = 5, b = 5;
        int expected = 25;
        // When
        int result = Calculator.multiplication(a, b);
        // Then
        assertEquals(expected, result);
    }

    @Test
    void division_isEqualByGivenParameters() {
        // Given
        int a = 10, b = 5;
        double expected = 2;
        // When
        double result = Calculator.division(a, b);
        // Then
        assertEquals(expected, result);
    }
}