package basket;

import grocery.Price;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Basket {
    public double calculateTotalCost(String basket) {
        String clearBasket = recognizedBasket(basket);
        Price goods = new Price();

        System.out.println(clearBasket);
        System.out.println(goods.goodsPrice);

        return 555;
    }

    private String recognizedBasket(String basket) {
        if (basket != null && !basket.isEmpty()){
            return Arrays.stream(basket.toUpperCase().split(" ")).collect(Collectors.joining());
        } else {
            throw new NullPointerException("Wrong product key");
        }
    }
}
