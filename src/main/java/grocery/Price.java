package grocery;

import java.util.HashMap;

public class Price {
    public final HashMap<String, Goods> goodsPrice = new HashMap<>();
    {
        goodsPrice.put("A", new GoodsA());
        goodsPrice.put("B", new GoodsB());
        goodsPrice.put("C", new GoodsC());
        goodsPrice.put("D", new GoodsD());
        //System.out.println(goodsPrice);
    }

}
