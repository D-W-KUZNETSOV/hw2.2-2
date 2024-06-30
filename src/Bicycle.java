public class Bicycle extends WeeledTransport {

  public Bicycle(String modelName,int wheelsCount) {
    super(modelName,wheelsCount );
  }

@Override
  public void updateTyre() {
    System.out.println("Меняем покрышку у велосипеда");
  }

  @Override
  public void service() {
    updateTyre();
  }

}
