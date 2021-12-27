package skeletal;

public class VendingManager {
  public static void main(String[] args) {
    Invending candy = new CandyVending();
    Invending drink = new DrinkVending();

    candy.process();
    System.out.println("********************");
    drink.process();

    if (drink instanceof VendingService) {
      VendingService vs = (VendingService) drink;
      vs.service();
    }
  }
}
