import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountCalculatorTest {

    //Normal case
    @Test
    void discountCalculatorSuccess() {
        var calculator = new DiscountCalculator();
        assertEquals(80, calculator.calculateDiscount(100, 20));
    }

    //Edge case
    @Test
    void NoDiscount() {
        var calculator = new DiscountCalculator();
        assertEquals(100, calculator.calculateDiscount(100.0, 0));
    }

    //Edge case
    @Test
    void FullDiscount() {
        var calculator = new DiscountCalculator();
        assertEquals(0, calculator.calculateDiscount(100.0, 100));
    }

    //Edge case
    @Test
    void PriceAsAVeryLowDouble() {
        var calculator = new DiscountCalculator();
        assertEquals(0.0075, calculator.calculateDiscount(0.01, 25));
    }

    //Invalid case
    @Test
    void PriceLessThanZeroSuccess() {
        var calculator = new DiscountCalculator();
        assertEquals(0, calculator.calculateDiscount(-50, 10));
    }

    //Invalid case
    @Test
    void PercentageOver100() {
        var calculator = new DiscountCalculator();
        assertEquals(-10, calculator.calculateDiscount(100, 110));
    }
}