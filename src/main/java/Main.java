import basket.BasketImpl;
import grocery.Price;

public class Main {
    public static void main(String[] args) {

        BasketImpl basket = new BasketImpl(() -> Price.goodsPrice);

        basket.calculateTotalCost("abcdaba");

        //basket.calculateTotalCost("a b c d a b a");
        //basket.calculateTotalCost("NOabcdaba");
        //basket.calculateTotalCost("~gg~");
        //basket.calculateTotalCost("");
        //basket.calculateTotalCost(null);
    }
}
