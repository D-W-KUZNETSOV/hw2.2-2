public class Car extends MotorTransport {


  public Car(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
  }

@Override
  public void updateTyre() {
    System.out.println("Меняем покрышку у машины");
  }
@Override
  public void service() {
    updateTyre();
    checkEngine();
  }
}
