package basket;
import grocery.GoodsImpl;
import grocery.Price;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Basket {
    public double calculateTotalCost(String basket) {
        double totalsum = 0;
        String clearBasket = recognizedBasket(basket);
        System.out.println("\nТовары в корзине:\n" + clearBasket);
        Price goods = new Price();
        for(char goodsID: goods.goodsPrice.keySet()){
            long quantity = countQuantity(clearBasket).get(goodsID);
            System.out.print(quantity + " X ");
            System.out.print("Tовар " + goodsID);
            GoodsImpl a = (GoodsImpl) goods.goodsPrice.get(goodsID);
            System.out.println(" (" + a.getName() + ")");
            if (quantity>=a.getDiscountQuantity()){
                double sum = quantity/a.getDiscountQuantity()*a.getDiscountPrice()+
                        quantity%a.getDiscountQuantity()*a.getPrice();
                System.out.println("= " + sum);
                totalsum = totalsum + sum;
            } else {
                double sum = quantity * a.getPrice();
                System.out.println("= " + sum);
                totalsum = totalsum + sum;
            }
        }
        return totalsum;
    }

    private String recognizedBasket(String basket) {
        if (basket != null && !basket.isEmpty()){
            return Arrays.stream(basket.toUpperCase().split(" ")).collect(Collectors.joining());
        } else {
            throw new NullPointerException("Wrong product key");
        }
    }

    private static Map<Character, Integer> countQuantity (String basket){
        Map<Character, Integer> quantity = new HashMap<>();
        for (int i=0; i<basket.length(); i++){
            if (quantity.containsKey(basket.charAt(i))){
                quantity.put(basket.charAt(i), quantity.get(basket.charAt(i))+1);
            } else {
                quantity.put(basket.charAt(i), 1);
            }
        }
        return quantity;
    }
}
