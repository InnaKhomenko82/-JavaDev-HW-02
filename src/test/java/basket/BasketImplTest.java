package basket;

import grocery.Price;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketImplTest {
    private static final double EPSILON = 0.0000001D;
    private BasketImpl basket;

    @Before
    public void setUp(){
        basket = new BasketImpl(() -> Price.goodsPrice);
    }

    @Test
    public void testCalculateTotalCost() {

        double expected = 13.25;
        double actual = basket.calculateTotalCost("ABCDABA");
        assertEquals(expected, actual, EPSILON);
    }

    @Test
    public void testLowerCaseCalculateTotalCost() {
        double expected = 13.25;
        double actual = basket.calculateTotalCost("abcdaba");
        assertEquals(expected, actual, EPSILON);
    }

    @Test
    public void testSpacesCalculateTotalCost() {
        double expected = 13.25;
        double actual = basket.calculateTotalCost("a b c d a b a");
        assertEquals(expected, actual, EPSILON);
    }

    @Test
    public void testGoodsSoldOutCalculateTotalCost() {
        double expected = 13.25;
        double actual = basket.calculateTotalCost("NOabcdaba");
        assertEquals(expected, actual, EPSILON);
    }

    @Test
    public void testNullCalculateTotalCost() {
        double expected = 0.0;
        double actual = basket.calculateTotalCost("");
        assertEquals(expected, actual, EPSILON);
    }

    @Test
    public void testSpecialSymbolsCalculateTotalCost() {
        double expected = 0.0;
        double actual = basket.calculateTotalCost("~gg~");
        assertEquals(expected, actual, EPSILON);
    }
}