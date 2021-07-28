package grocery;
import lombok.Data;

@Data
public final class Goods{

    private final String name;
    private final double price;
    private final long discountQuantity;
    private final double discountPrice;

    public Goods(String name, double price){
        this.name = name;
        this.price = price;
        discountQuantity = 1;
        discountPrice = price;
    }

    public Goods(String name, double price, long discountQuantity, double discountPrice){
        this.name = name;
        this.price = price;
        this.discountQuantity = discountQuantity;
        this.discountPrice = discountPrice;
    }
}