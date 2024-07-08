//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProdImp car = new ProdImp("MMM", 0, 3333);


//        System.out.println("hi");
        System.out.println(car.getPrice() + ", " + car.getWeight() + ", " + car.getMarketName());


    }
}