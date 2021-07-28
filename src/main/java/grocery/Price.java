package grocery;

import java.util.HashMap;

public interface Price {
    HashMap<Character, Goods> goodsPrice = new PriceImpl().getAllGoods();
    HashMap<Character, Goods> getAllGoods();
}
