package grocery;
import lombok.Data;

@Data
public class GoodsImpl implements Goods<Character>{

    private String name;
    private double price;
    private long discountQuantity;
    private double discountPrice;

    public GoodsImpl(String name, double price){
        this.name = name;
        this.price = price;
        discountQuantity = 1;
        discountPrice = price;
    }

    public GoodsImpl(String name, double price, long discountQuantity, double discountPrice){
        this.name = name;
        this.price = price;
        this.discountQuantity = discountQuantity;
        this.discountPrice = discountPrice;
    }
}
