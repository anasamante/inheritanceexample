public class ElectricCar extends Car {

    public ElectricCar(String name, String manufactureName) {
        super(name, manufactureName);
    }

    public void charge(){
        System.out.println("Charging electric...");
    }

}
