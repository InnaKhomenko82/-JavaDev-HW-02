import basket.Basket;

public class Main {
    public static void main(String[] args) {
        System.out.println("Общая стоимость:\n=" + new Basket()
                .calculateTotalCost("abcdaban"));
    }
}
