public class Main {


  public static void main(String[] args) {


    Car car = new Car("Car",4);
    Car car2 = new Car("Car1",4);
    Truck truck = new Truck("Truck",6);
    Truck truck2 = new Truck("Truck",8);
    Bicycle bicycle = new Bicycle("Bicycle",2);
    Bicycle bicycle2 = new Bicycle("Bicycle1",2);

    ServiseStatione statione = new ServiseStatione();
    statione.check(car2,bicycle,truck);


  }

}
