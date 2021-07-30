package basket;
import grocery.Goods;
import grocery.Price;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BasketImpl implements Price {

    private final HashMap<Character, Goods> basketGoods;

    public BasketImpl(Price price){
        basketGoods = price.getAllGoods();
    }

    @Override
    public HashMap<Character, Goods> getAllGoods() {
        return basketGoods;
    }

    public double calculateTotalCost(String basket) {
        double totalcost = 0.0d;
        String clearBasket = recognizedBasket(basket);
        if (clearBasket != null) {
            System.out.println("\nGoods in your basket:\n" + clearBasket);
            priceContainsGoods(clearBasket);
            for (char goodsID : basketGoods.keySet()) {
                long quantity = countQuantity(clearBasket).get(goodsID);
                System.out.print(quantity + " X " + "Goods " + goodsID);
                Goods a = basketGoods.get(goodsID);
                System.out.println(" (" + a.getName() + ")");
                if (quantity >= a.getDiscountQuantity()) {
                    double cost = quantity / a.getDiscountQuantity() * a.getDiscountPrice() +
                            quantity % a.getDiscountQuantity() * a.getPrice();
                    System.out.println("= " + cost);
                    totalcost = totalcost + cost;
                } else {
                    double cost = quantity * a.getPrice();
                    System.out.println("= " + cost);
                    totalcost = totalcost + cost;
                }
            }
        }
        System.out.println("****************");
        System.out.println("Total amount:\n=" + totalcost);
        return totalcost;
    }

    private String recognizedBasket(String basket) {
        if (basket != null && !basket.isEmpty()&& basket.matches("[a-zA-Z\s]+")){
            return Arrays.stream(basket.toUpperCase().split(" ")).collect(Collectors.joining());
        } else {
            System.out.println("Please use just letters");
            return null;
        }
    }

    private void priceContainsGoods(String basket) {
        for (char a: basket.toCharArray()){
            if (!goodsPrice.containsKey(a)){
                System.out.println("Goods " + a + " sold out");
            }
        }
        System.out.println("****************");
    }

    private static Map<Character, Integer> countQuantity (String basket){
        Map<Character, Integer> goodsQuantity = new HashMap<>();
        for (int i=0; i<basket.length(); i++){
            if (goodsQuantity.containsKey(basket.charAt(i))){
                goodsQuantity.put(basket.charAt(i), goodsQuantity.get(basket.charAt(i))+1);
            } else {
                goodsQuantity.put(basket.charAt(i), 1);
            }
        }
        return goodsQuantity;
    }
}
