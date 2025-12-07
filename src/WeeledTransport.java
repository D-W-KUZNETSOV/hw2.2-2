public abstract class WeeledTransport implements Transport{

private final String modelName;
private final int wheelsCount;

  public WeeledTransport(String modelName, int wheelsCount) {
    this.modelName = modelName;
    this.wheelsCount = wheelsCount;
  }

  public String getModelName() {
    return modelName;
  }

  public int getWheelsCount() {
    return wheelsCount;
  }

  public abstract void updateTyre();


  @Override
  public void service() {
    updateTyre();

  }
}
