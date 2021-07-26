package grocery;

public abstract class Goods {

    private String name;
    private double price;
    private long discountQuantity;
    private double discountPrice;

    public void setGoods(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setDiscount(int discountQuantity, double discountPrice){
        this.discountQuantity = discountQuantity;
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString(){
        return "Goods " + name + ", price " + price + ", discountQuantity " + discountQuantity + ", discountPrice " + discountPrice + "\n";
    }
}
