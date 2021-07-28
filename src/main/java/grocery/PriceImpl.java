package grocery;

import java.util.HashMap;

public class PriceImpl implements Price {

    private HashMap<Character, Goods> goodsPrice = new HashMap<>();

    PriceImpl(){
        goodsPrice.put('A', new Goods("Apple", 1.25, 3, 3.00));
        goodsPrice.put('B', new Goods("Blueberry", 4.25));
        goodsPrice.put('C', new Goods("Coconuts", 1.00, 6, 5.00));
        goodsPrice.put('D', new Goods("Daikon", 0.75));
    }

    @Override
    public HashMap<Character, Goods> getAllGoods() {
        return goodsPrice;
    }
}
