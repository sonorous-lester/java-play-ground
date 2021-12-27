package skeletal;

public abstract class AbstractVending implements Invending {

  @Override
  public void start() {
    System.out.println("Start Vending machine");
  }

  @Override
  public void stop() {
    System.out.println("Stop Vending machine");
  }

  public void process() {
    start();
    chooseProduct();
    stop();
  }
}
