package grocery;

import java.util.HashMap;

public class Price {
    public final HashMap<Character, Goods> goodsPrice = new HashMap<>();
    {
        goodsPrice.put('A', new GoodsImpl("Apple", 1.25, 3, 3.00));
        goodsPrice.put('B', new GoodsImpl("Blueberry", 4.25));
        goodsPrice.put('C', new GoodsImpl("Coconuts", 1.00, 6, 5.00));
        goodsPrice.put('D', new GoodsImpl("Daikon", 0.75));
    }
}
