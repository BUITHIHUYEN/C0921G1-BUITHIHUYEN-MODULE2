package bai_8_clean_code_refacetoring.thuc_hanh.caculator.thuc_hanh.bai_1_doi_ten_bien_va_tach_hang;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        @DisplayName("Testing addition")
        void testCalculateAdd () {
            int firstOperand = 1;
            int secondOperand = 1;
            char operator = '+';
            int expected = 2;

            int result = Calculator.calculate(firstOperand, secondOperand, operator);
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Testing subtraction")
        void testCalculateSub () {
            int a = 2;
            int b = 1;
            char o = '-';
            int expected = 1;

            int result = Calculator.calculate(a, b, o);
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Testing multiplication")
        void testCalculateMul () {
            int a = 2;
            int b = 2;
            char o = '*';
            int expected = 4;

            int result = Calculator.calculate(a, b, o);
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Testing division")
        void testCalculateDiv () {
            int a = 6;
            int b = 3;
            char o = '/';
            int expected = 2;

            int result = Calculator.calculate(a, b, o);
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Testing division by zero")
        void testCalculateDivByZero () {
            int a = 2;
            int b = 0;
            char operator = '/';

            assertThrows(RuntimeException.class,
                    () -> {
                        Calculator.calculate(a, b, operator);
                    });
        }
    @Test
    @DisplayName("Testing multiplication")
        void testCalculateWrongOperator () {
            int firstOperand = 2;
            int secondOperand = 0;
            char operator = '=';

            assertThrows(RuntimeException.class,
                    () -> {
                        Calculator.calculate(firstOperand, secondOperand, operator);
                    });
        }
}