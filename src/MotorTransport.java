public abstract class MotorTransport extends WeeledTransport {

  public MotorTransport(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
  }
  public void checkEngine() {
    System.out.println("Проверяем двигатель");
  }
  public void service() {
    updateTyre();
    checkEngine();

  }
}
