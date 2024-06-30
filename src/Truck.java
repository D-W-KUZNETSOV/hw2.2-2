public class Truck extends MotorTransport {

  public Truck(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
  }

  @Override
  public void updateTyre() {
    System.out.println("Меняем покрышку у грузовика");
  }

  public void checkTrailer() {
    System.out.println("Проверяем прицеп");
  }

  @Override
  public void service() {
    updateTyre();
    checkEngine();
    checkTrailer();

  }
}
