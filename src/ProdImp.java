public class ProdImp implements Inter{

        String MarketName;
        int price;
        int Weight;

        public ProdImp(String newModel, int newWeight, int newPrice) {
            MarketName = newModel;
            price = newPrice;
            Weight = newWeight;
        }


        public String getMarketName() {
            System.out.println();
            return MarketName;
        }


        public int getPrice() {

            return price;
        }


        public int getWeight() {

            return Weight;
        }

        public void setMarketName(String newModel) {
            MarketName = newModel;
        }


        public void setPrice(int newPrice) {
            price = newPrice;
        }

        public void setWeight(int newWeight) {
            Weight = newWeight;
        }









}
