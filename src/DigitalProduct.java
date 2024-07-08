public class DigitalProduct implements Inter {

    int price;

    public DigitalProduct(int newPrice) {
        price = newPrice;
    }

    @Override
    public String getMarketName() {
        return "digital product";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }
}
